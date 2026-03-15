public class ReverseString {
    public static void main(String[] args) {

        String original = "Hello World";

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder(original);

        // Reverse the string
        sb.reverse();

        // Print reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + sb);
    }
}
