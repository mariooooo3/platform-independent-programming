package ExceptionHandling.Task3;

import java.util.Random;

public class A {
    void g() throws E1, E2, E3 {
        Random rand = new Random();
        int choice = rand.nextInt(3);

        switch (choice) {
            case 0:
                throw new E1("Exception: E1");
            case 1:
                throw new E2("Exception: E2");
            case 2:
                throw new E3("Exception: E3");
            default:
                System.out.println("Nu avem exceptii");
        }
    }
}