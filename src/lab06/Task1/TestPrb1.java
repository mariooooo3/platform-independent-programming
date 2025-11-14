package lab06.Task1;

public class TestPrb1 {
    protected static void printTest(Test t) {
        t.println();
    }

    public static void task1() {
        Test t = null;
        printTest(t);
    }

    public static void task2() {
        Test t = null;
        try {
            printTest(t);
        } finally {
            System.out.println("A");
        }
    }

    public static void task3() {
        Test t = null;
        try {
            printTest(t);
        } catch (Exception e) {
            System.out.println("B");
        }
    }

    public static void task4() {
        int[] x = new int[2];
        try {
            x[3] = 3;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void task5() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Metoda nu merge");
    }

    public static void main(String[] args) {
//		task3();
//		task2();
//		task1();
//		task4();
        task5();
    }

}