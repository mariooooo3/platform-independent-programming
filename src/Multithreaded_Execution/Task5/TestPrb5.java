package Multithreaded_Execution.Task5;


public class TestPrb5 extends GenerareIntreg {
    private int valoareCurentaPara = 0;

    synchronized public int next() {
        ++valoareCurentaPara;
        Thread.yield();
        ++valoareCurentaPara;
        System.out.println(valoareCurentaPara);
        return valoareCurentaPara;
    }

    public static void main(String[] args) {
        VerificareNumarPar.test(new TestPrb5(), 10);
    }
}

