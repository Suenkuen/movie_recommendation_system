import java.util.Scanner;

public class Address {
    private String street;
    private int apartment;
    private String city;
    private char[] state = new char[2];

    public Address(Scanner sc) {
        System.out.print("Enter street: ");
        this.street = sc.nextLine();
        System.out.print("Enter city: ");
        this.city = sc.nextLine();
        System.out.print("Enter state (2-letter code): ");
        String stateInput = sc.nextLine();
        while (stateInput.length() != 2) {
            System.out.print("Invalid state code. Please enter a 2-letter state code: ");
            stateInput = sc.nextLine();
        }
        this.state = stateInput.toCharArray();
        System.out.print("Enter apartment (optional, enter 0 if not applicable): ");
        String apartmentInput = sc.nextLine();
        if (apartmentInput.equals("0") || apartmentInput.isEmpty()) {
            this.apartment = 0;
        } else {
            this.apartment = Integer.parseInt(apartmentInput);
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char[] getState() {
        return state;
    }

    public void setState(char[] state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Street Address: " + street + (apartment != 0 ? ", Apartment: " + apartment : "") + ", City: " + city + ", State: " + new String(state);
    }
}
