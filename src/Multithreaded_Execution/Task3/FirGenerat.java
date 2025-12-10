package Multithreaded_Execution.Task3;


import java.util.concurrent.*;

public class FirGenerat extends Thread implements Runnable {

    private int id;

    public FirGenerat(int i) {
        this.id = i;
        System.out.println("NonDaemon" + i + " activat");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fd = new Thread(new FirDaemon());
        fd.setDaemon(true);
        fd.start();
        System.out.println("Este firul creat in main Daemon? " + fd.isDaemon());
        TimeUnit.SECONDS.sleep(5);
    }
}

