package Multithreaded_Execution.Task2;


import java.util.Random;

public class Fire implements Runnable {

    Random rand = new Random();
    int choice = rand.nextInt(11);

    @Override
    public void run() {
        try {
            Thread.sleep(choice * 1000);
            System.out.println("Doarme timp de:" + choice + " secunde");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
