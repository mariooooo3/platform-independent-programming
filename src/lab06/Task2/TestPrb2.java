package lab06.Task2;

import java.util.Random;

public class TestPrb2 {
    public void metodaCuExceptie() throws PIPException {
        Random rand = new Random();
        int choice = rand.nextInt(2);

        switch (choice) {
            case 0:
                throw new PIPException("PIP Exception");
            case 1:
                System.out.println("Nu avem exceptii");
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                TestPrb2 test = new TestPrb2();
                test.metodaCuExceptie();
            } catch (PIPException p) {
                System.out.println("Iteratia " + i + " arunca exceptia " + p);
            }
        }

    }
}