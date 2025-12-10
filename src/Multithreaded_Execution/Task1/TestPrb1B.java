package Multithreaded_Execution.Task1;


public class TestPrb1B {
    public static void main(String[] args) {
        Thread t = new Thread(new Descrescator(10));
        System.out.println("In asteptarea decolarii:");
        t.start();

        System.out.println("Terminare main.");
    }
}