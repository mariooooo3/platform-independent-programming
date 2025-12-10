package Multithreaded_Execution.Task3;


public class FirDaemon extends Thread implements Runnable {
    public static final int DIMENSIUNE = 10;
    private Thread[] fire = new Thread[DIMENSIUNE];


    @Override
    public void run() {
        for (int i = 0; i < DIMENSIUNE; i++) {
            fire[i] = new Thread(new FirGenerat(i));
            fire[i].start();

            System.out.println("FirGenerat " + i + " pornit");

            System.out.println("isDaemon = " + fire[i].isDaemon());

        }

    }

}

