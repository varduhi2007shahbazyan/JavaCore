
package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYEES = "2";
    private static final String SEARCH_EMPLOYEE = "3";
    private static final String SEARCH_BY_COMPANY = "4";
    private static final String SEARCH_BY_SALARY = "5";
    private static final String DELETE_EMPLOYEE = "6";

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {

            printCommands();

            String command = scanner.nextLine();

            switch (command) {

                case EXIT:
                    isRun = false;
                    System.out.println("Program finished!");
                    break;

                case ADD_EMPLOYEE:
                    addEmployee();
                    break;

                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;

                case SEARCH_EMPLOYEE:
                    searchEmployee();
                    break;

                case SEARCH_BY_COMPANY:
                    searchEmployeesByCompany();
                    break;

                case SEARCH_BY_SALARY:
                    searchEmployeesBySalary();
                    break;

                case DELETE_EMPLOYEE:
                    deleteEmployee();
                    break;

                default:
                    System.out.println("command not found!");
            }
        }
    }

    private static void printCommands() {

        System.out.println("\nPlease input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add Employee");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for print all Employees");
        System.out.println("Please input " + SEARCH_EMPLOYEE + " for search Employee by ID");
        System.out.println("Please input " + SEARCH_BY_COMPANY + " for search Employees by company");
        System.out.println("Please input " + SEARCH_BY_SALARY + " for search Employees by minimum salary");
        System.out.println("Please input " + DELETE_EMPLOYEE + " for delete Employee");
    }

    private static void addEmployee() {

        System.out.println("Please input name");
        String name = scanner.nextLine();

        System.out.println("Please input surname");
        String surname = scanner.nextLine();

        System.out.println("Please input employee ID");
        String employeeID = scanner.nextLine();

        System.out.println("Please input salary");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input company");
        String company = scanner.nextLine();

        System.out.println("Please input position");
        String position = scanner.nextLine();

        Employee employee = new Employee(
                name,
                surname,
                employeeID,
                salary,
                company,
                position
        );

        if (employeeStorage.add(employee)) {
            System.out.println("Employee added!!!");
        } else {
            System.out.println("Employee ID already exists!");
        }
    }

    private static void searchEmployee() {

        System.out.println("Please input employee ID");

        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.searchByID(employeeID);

        if (employee != null) {
            System.out.println("Employee found:");
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void searchEmployeesByCompany() {

        System.out.println("Please input company");

        String company = scanner.nextLine();

        employeeStorage.searchByCompany(company);
    }

    private static void searchEmployeesBySalary() {

        System.out.println("Please input minimum salary");

        double salary = Double.parseDouble(scanner.nextLine());

        employeeStorage.searchByMinimumSalary(salary);
    }

    private static void deleteEmployee() {

        System.out.println("Please input employee ID");

        String employeeID = scanner.nextLine();

        if (employeeStorage.deleteByID(employeeID)) {
            System.out.println("Employee deleted!!!");
        } else {
            System.out.println("Employee not found!");
        }
    }
}
