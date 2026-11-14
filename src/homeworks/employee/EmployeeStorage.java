
package homeworks.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public boolean add(Employee employee) {

        if (containsID(employee.getEmployeeID())) {
            return false;
        }

        if (size == array.length) {
            extend();
        }

        array[size++] = employee;

        return true;
    }

    private void extend() {

        Employee[] tmp = new Employee[array.length + 10];

        System.arraycopy(array, 0, tmp, 0, array.length);

        array = tmp;
    }

    public boolean containsID(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (array[i].getEmployeeID().equals(employeeID)) {
                return true;
            }
        }

        return false;
    }

    public void print() {

        if (size == 0) {
            System.out.println("No employees found!");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
            System.out.println();
        }
    }

    public Employee searchByID(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (array[i].getEmployeeID().equals(employeeID)) {
                return array[i];
            }
        }

        return null;
    }

    public void searchByCompany(String company) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (array[i].getCompany().equalsIgnoreCase(company)) {
                System.out.println(array[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company " + company);
        }
    }

    public void searchByMinimumSalary(double salary) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (array[i].getSalary() >= salary) {
                System.out.println(array[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with this salary!");
        }
    }

    public boolean deleteByID(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (array[i].getEmployeeID().equals(employeeID)) {

                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }

                array[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }
}
