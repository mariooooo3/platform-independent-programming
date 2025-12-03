package Apply_Polymorphism_and_Dynamic_Binding.task4;

public class TestPrb4 {
    public static void main(String[] args) {
        Interf1 obj = new ClasaA();
        ((ClasaA) obj).metoda1();
        ((ClasaA) obj).metoda2();
        ((ClasaA) obj).metoda3();
        ((ClasaA) obj).metoda4();


    }
}
