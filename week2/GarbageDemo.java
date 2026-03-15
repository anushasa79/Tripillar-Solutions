class GarbageDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called for object");
    }

    public static void main(String[] args) {

        // Creating object
        GarbageDemo obj = new GarbageDemo();

        // Making object eligible for Garbage Collection
        obj = null;

        // Requesting Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}
