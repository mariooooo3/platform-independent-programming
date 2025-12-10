package Multithreaded_Execution.Task1;


public class TestPrb1A {
    public static void main(String args[]) {
        Descrescator decoleaza = new Descrescator(10);
        System.out.println("In asteptarea decolarii:");
        decoleaza.run();
        System.out.println("Terminare main.");
    }
}
