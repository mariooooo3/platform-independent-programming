package Multithreaded_Execution.Task1;


public class TestPrb1C {
    public static void main(String[] args) {
        System.out.println("In asteptarea decolarii:");
        for (int i = 0; i < 5; i++)
            new Thread(new Descrescator(10)).start();

        System.out.println("Terminare main.");
    }
}
