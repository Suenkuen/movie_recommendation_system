import java.util.ArrayList;

public class Department {
    private String name;
    private double budget;
    private ArrayList<Employee> employees;

    public Department(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(String firstName, String lastName) {
        Employee employeeToDelete = null;
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                employeeToDelete = employee;
                break;
            }
        }
        if (employeeToDelete != null) {
            employees.remove(employeeToDelete);
            System.out.println("Employee " + firstName + " " + lastName + " deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Employee searchEmployee(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                System.out.println(employee);
                return employee;
            }
        }
        System.out.println("Employee not found.");
        return null;
    }
}
