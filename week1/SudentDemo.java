
class Student {
    int id;
    String name;

    Student(){
        id=0;
        name="Unknown";
    }
    Student(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("ID: " + id + ",Name: " + name);
    }
}

public class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("Using Default Constructor: ");
        s1.display();

        Student s2=new Student(1012,"Nisha");
        System.out.println("Using Parameterized Constructor: ");
        s2.display();
    }
}
