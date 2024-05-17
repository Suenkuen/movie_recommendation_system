import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private Address address;

    public Employee(Scanner sc) {
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = sc.nextLine();
        this.address = new Address(sc);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", " + address;
    }
}
