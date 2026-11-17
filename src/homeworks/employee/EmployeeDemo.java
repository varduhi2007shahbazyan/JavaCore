package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {
        int command;

        do {
            System.out.println("0. EXIT");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. PRINT ALL EMPLOYEES");
            System.out.println("3. SEARCH EMPLOYEE BY ID");
            System.out.println("4. SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5. ADD COMPANY");
            System.out.println("6. PRINT ALL COMPANIES");
            System.out.println("7. SEARCH COMPANY BY ID");
            System.out.println("8. PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9. CHANGE EMPLOYEE COMPANY");
            System.out.println("10. PRINT EMPLOYEE COMPANY");
            System.out.println("11. COUNT EMPLOYEES BY COMPANY");
            System.out.println("12. TOTAL SALARY BY COMPANY");
            System.out.println("13. HIGHEST SALARY EMPLOYEE");
            System.out.println("14. DELETE EMPLOYEE");
            System.out.println("15. DELETE COMPANY");

            System.out.println("Input command:");
            command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    System.out.println("Goodbye!");
                    break;

                case 1:
                    addEmployee();
                    break;

                case 2:
                    employeeStorage.printAll();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    searchEmployeesByCompanyName();
                    break;

                case 5:
                    addCompany();
                    break;

                case 6:
                    companyStorage.printAll();
                    break;

                case 7:
                    searchCompany();
                    break;

                case 8:
                    searchEmployeesByCompanyId();
                    break;

                case 9:
                    changeEmployeeCompany();
                    break;

                case 10:
                    printEmployeeCompany();
                    break;

                case 11:
                    countEmployeesByCompany();
                    break;

                case 12:
                    totalSalaryByCompany();
                    break;

                case 13:
                    printHighestSalaryEmployee();
                    break;

                case 14:
                    deleteEmployee();
                    break;

                case 15:
                    deleteCompany();
                    break;

                default:
                    System.out.println("Invalid command.");
            }

        } while (command != 0);
    }

    private static void addEmployee() {
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        System.out.println("Enter employee salary:");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter employee position:");
        String position = scanner.nextLine();

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company with ID " + companyId + " not found.");
            System.out.println("Please add the company first.");
            return;
        }

        Employee employee = new Employee(name, surname, employeeID, salary, company, position);

        if (employeeStorage.add(employee)) {
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee with this ID already exists.");
        }
    }

    private static void searchEmployee() {
        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee == null) {
            System.out.println("Employee not found.");
        } else {
            System.out.println(employee);
        }
    }

    private static void searchEmployeesByCompanyName() {
        System.out.println("Enter company name:");
        String companyName = scanner.nextLine();

        employeeStorage.printByCompanyName(companyName);
    }

    private static void addCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        System.out.println("Enter company name:");
        String name = scanner.nextLine();

        System.out.println("Enter company industry:");
        String industry = scanner.nextLine();

        System.out.println("Enter company country:");
        String country = scanner.nextLine();

        Company company = new Company(companyId, name, industry, country);

        if (companyStorage.add(company)) {
            System.out.println("Company added successfully.");
        } else {
            System.out.println("Company with this ID already exists.");
        }
    }

    private static void searchCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
        } else {
            System.out.println(company);
        }
    }

    private static void searchEmployeesByCompanyId() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        employeeStorage.printByCompanyId(companyId);
    }

    private static void changeEmployeeCompany() {
        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("Enter new company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        employee.setCompany(company);
        System.out.println("Employee company changed successfully.");
    }

    private static void printEmployeeCompany() {
        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee == null) {
            System.out.println("Employee not found.");
        } else {
            System.out.println(employee.getCompany());
        }
    }

    private static void countEmployeesByCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        int count = employeeStorage.countByCompanyId(companyId);

        System.out.println("Number of employees: " + count);
    }

    private static void totalSalaryByCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        double total = employeeStorage.totalSalaryByCompanyId(companyId);

        System.out.println("Total salary: " + total);
    }

    private static void printHighestSalaryEmployee() {
        Employee employee = employeeStorage.getHighestSalaryEmployee();

        if (employee == null) {
            System.out.println("No employees found.");
        } else {
            System.out.println(employee);
        }
    }

    private static void deleteEmployee() {
        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        if (employeeStorage.deleteById(employeeID)) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void deleteCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        if (employeeStorage.hasEmployeesByCompanyId(companyId)) {
            System.out.println("Cannot delete company. Employees are assigned to it.");
            return;
        }

        companyStorage.deleteById(companyId);
        System.out.println("Company deleted successfully.");
    }
}