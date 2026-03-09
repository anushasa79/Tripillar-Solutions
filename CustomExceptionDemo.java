// Custom Exception Class
class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method using throws keyword
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // Using throw keyword
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } 
        else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change value to test
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues normally.");
    }
}