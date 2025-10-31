package lab04.task5;


public class TestPrb5 {
    TestPrb5() {
        System.out.println("Constructor TestPrb5");
    }

    public static void main(String[] args) {
        ClasaExterioara cx = new ClasaExterioara();
        ClasaExterioara.ClasaIn ci = new ClasaExterioara.ClasaIn();
        ci.metoda3();
        ClasaExterioara.ClasaInStatica cis = new ClasaExterioara.ClasaInStatica();
        cis.metoda1();
    }
}