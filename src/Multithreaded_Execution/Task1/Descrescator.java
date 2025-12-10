package Multithreaded_Execution.Task1;


public class Descrescator implements Runnable {
    protected int numarator = 10;
    // contor fire de executie
    private static int numarTask = 0;
    // index-ul firului de executie
    private final int id = numarTask++;

    public Descrescator(int numarator) {
        this.numarator = numarator;
    }

    public String stare() {
        String x = new String();
        if (numarator > 0)
            x = x + numarator;
        else
            x = "Decoleaza!";
        return "#" + id + "(" + x + "). ";
    }

    public void run() { // executie in fir
        while (numarator-- > 0) {
            System.out.println(stare());
            Thread.yield();
        }
    }
}
