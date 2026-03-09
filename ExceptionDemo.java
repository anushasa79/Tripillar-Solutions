import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {

        // 1️ Checked Exception Example
        try {
            FileReader file = new FileReader("test.txt");
            System.out.println("File opened successfully.");
        } 
        catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        // 2️ Unchecked Exception Example
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}