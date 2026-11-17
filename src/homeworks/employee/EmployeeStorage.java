package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public boolean add(Employee employee) {
        if (employee == null || getById(employee.getEmployeeID()) != null) {
            return false;
        }

        if (size == employees.length) {
            Employee[] newEmployees = new Employee[employees.length * 2];

            for (int i = 0; i < size; i++) {
                newEmployees[i] = employees[i];
            }

            employees = newEmployees;
        }

        employees[size++] = employee;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(employeeID)) {
                return employees[i];
            }
        }

        return null;
    }

    public void printByCompanyName(String companyName) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getName().equalsIgnoreCase(companyName)) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found.");
        }
    }

    public void printByCompanyId(String companyId) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(companyId)) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found.");
        }
    }

    public int countByCompanyId(String companyId) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(companyId)) {
                count++;
            }
        }

        return count;
    }

    public double totalSalaryByCompanyId(String companyId) {
        double total = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(companyId)) {
                total += employees[i].getSalary();
            }
        }

        return total;
    }

    public Employee getHighestSalaryEmployee() {
        if (size == 0) {
            return null;
        }

        Employee highest = employees[0];

        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > highest.getSalary()) {
                highest = employees[i];
            }
        }

        return highest;
    }

    public boolean deleteById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(employeeID)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }

    public boolean hasEmployeesByCompanyId(String companyId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(companyId)) {
                return true;
            }
        }

        return false;
    }
}