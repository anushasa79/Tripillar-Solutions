public class StringDemo {
    public static void main(String[] args) {

        // 1️ String (Immutable)
        String str = "Hello";
        str.concat(" World");   // This does NOT change original string
        System.out.println("String after concat: " + str);

        str = str.concat(" World");  // Now reassigned
        System.out.println("String after reassignment: " + str);

        // 2️ StringBuilder (Mutable, Not Thread-Safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // Changes original object
        System.out.println("StringBuilder after append: " + sb);

        // 3️ StringBuffer (Mutable, Thread-Safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");  // Changes original object
        System.out.println("StringBuffer after append: " + sbf);
    }
}