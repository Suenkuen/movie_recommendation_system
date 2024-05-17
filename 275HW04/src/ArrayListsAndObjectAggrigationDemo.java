import java.util.Scanner;

public class ArrayListsAndObjectAggrigationDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create department
        System.out.print("Enter department name: ");
        String deptName = sc.nextLine();
        System.out.print("Enter department budget: ");
        double deptBudget = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        Department department = new Department(deptName, deptBudget);

        System.out.println("-------------------------------");

        // Test tool
        boolean loopToken = true;
        while (loopToken) {
            System.out.println("Please choose one option below");
            System.out.println("""
                1. Add an Employee to the Department
                2. Delete an Employee from the Department
                3. Print Employees of the Department
                4. Search for an Employee in the Department
                5. Exit
                """);

            int userOption = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (userOption) {
                case 1:
                    Employee employee = new Employee(sc);
                    department.addEmployee(employee);
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.print("Enter first name of employee to delete: ");
                    String deleteFirstName = sc.nextLine();
                    System.out.print("Enter last name of employee to delete: ");
                    String deleteLastName = sc.nextLine();
                    department.deleteEmployee(deleteFirstName, deleteLastName);
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    department.printEmployees();
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    System.out.print("Enter first name of employee to search: ");
                    String searchFirstName = sc.nextLine();
                    System.out.print("Enter last name of employee to search: ");
                    String searchLastName = sc.nextLine();
                    department.searchEmployee(searchFirstName, searchLastName);
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    loopToken = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input, please try again!");
                    System.out.println("-------------------------------");
            }
        }
        sc.close();
    }
}
