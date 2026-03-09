// Interface
interface Payment {
    void pay(double amount);   // abstract method
}

// CreditCardPayment class
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

// UPIPayment class
class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

// Main class
public class PAYMENT {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(5000);

        Payment p2 = new UPIPayment();
        p2.pay(1500);
    }
}