package Multithreaded_Execution.Task2;


public class TestPrb2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Fire()).start();
        }
    }
}