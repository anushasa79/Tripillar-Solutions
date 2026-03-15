// Final class (cannot be extended)
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Base class
class Parent {

    // Final variable (constant)
    final int number = 100;

    // Final method (cannot be overridden)
    final void show() {
        System.out.println("This is a final method.");
    }
}

// Child class
class Child extends Parent {

    //  Cannot override final method
    // void show() { }  // This would cause an error

    void display() {
        // number = 200;   Cannot change final variable
        System.out.println("Final variable value: " + number);
    }
}

public class FinalDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        obj.display();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}
