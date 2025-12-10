package Multithreaded_Execution.Task5;


class VerificareNumarPar implements Runnable {
    private GenerareIntreg generator;
    private final int id;
    int count = 0;

    public VerificareNumarPar(GenerareIntreg g, int ident) {
        generator = g;
        id = ident;
    }

    public void run() {
        while (!generator.isCanceled() && count < 100) {
            int val = generator.next();
            count++;
            if (val % 2 != 0) {
                System.out.println(val + "nu este numar par");
                generator.cancel();
            }
        }
    }

    public static void test(GenerareIntreg gp, int numar) {
        for (int i = 0; i < numar; i++)
            new Thread(new VerificareNumarPar(gp, 1)).start();

    }

    public static void test(GenerareIntreg gp) {
        test(gp, 10);
    }
}
