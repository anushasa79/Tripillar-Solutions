
class animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}
class dog extends animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}
