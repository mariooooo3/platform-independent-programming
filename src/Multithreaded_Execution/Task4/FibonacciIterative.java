package Multithreaded_Execution.Task4;


public class FibonacciIterative implements Runnable {
    int n;

    public FibonacciIterative(int n) {
        this.n = n;
    }

    public static long fib(int n) {
        long prev1 = 0, prev2 = 1;
        for (int i = 0; i < n; i++) {
            long savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return prev1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 46; i++) {
            new Thread(new FibonacciIterative(i)).start();
        }
        System.out.println("Main terminat");
    }

    @Override
    public void run() {
        long rez = fib(n);
        System.out.println("Fib(" + n + ") = " + rez);
    }
}
