
package module2;

public class MethodOverloading {
    public void display(int a){
        System.out.println("Integer Value: " + a);
    }
    public void display(int a,int b){
        System.out.println("Sum of two integers: " +(a+b));
    }
    public void display(double a){
        System.out.println("Double value: " + a);
    }
    public void display(String s){
        System.out.println("String value: " + s);
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.display(10);
        obj.display(10,20);
        obj.display(5.5);
        obj.display("Hello");
    }
}
