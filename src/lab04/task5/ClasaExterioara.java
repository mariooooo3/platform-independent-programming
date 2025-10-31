package lab04.task5;

public class ClasaExterioara {
    ClasaExterioara() {
        System.out.println("Constructor ClasaExterioara");
    }

    static class ClasaInStatica extends ClasaExterioara {
        ClasaInStatica() {
            System.out.println("Constructor ClasaInStatica");
        }

        void metoda1() {
            System.out.println("Metoda 1 ClasaInStatica");
        }

        static void metoda() {
            System.out.println("Metoda 2 ClasaInStatica");
        }
    }

    static class ClasaIn {
        ClasaIn() {
            System.out.println("Constructor ClasaIn");
        }

        void metoda3() {
            System.out.println("Metoda 3 ClasaIn");
        }
    }

}
