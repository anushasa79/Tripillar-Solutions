class LifeCycleThread extends Thread {

    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");
            Thread.sleep(1000);  // TIMED_WAITING state
            System.out.println("Thread resumed from sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws InterruptedException {

        LifeCycleThread t1 = new LifeCycleThread();

        // NEW State
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE State
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        // Give time to enter sleep
        Thread.sleep(200);
        System.out.println("State during sleep: " + t1.getState());

        // Wait for thread to finish
        t1.join();

        // TERMINATED State
        System.out.println("State after completion: " + t1.getState());
    }
}