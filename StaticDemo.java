class Student {

    // Static variable (shared by all objects)
    static String collegeName = "Sapthagiri College";

    // Instance variable
    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }

    // Instance method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();

        // Calling static method using class name
        Student.changeCollege("Global Engineering College");

        s1.display();
        s2.display();
    }
}