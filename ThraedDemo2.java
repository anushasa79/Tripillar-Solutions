// Creating thread by implementing Runnable interface
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);
        t2.start();   // Start thread
    }
}