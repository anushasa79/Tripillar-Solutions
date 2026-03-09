public class DivisionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // May cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}