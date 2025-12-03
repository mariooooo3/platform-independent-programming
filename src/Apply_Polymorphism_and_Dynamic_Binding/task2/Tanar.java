package Apply_Polymorphism_and_Dynamic_Binding.task2;

public class Tanar {
    Tanar() {
        System.out.println("Constructor Tanar");
    }

    public void metoda1() {
        System.out.println("Met1 Tanar");
    }

    public void metoda2() {
        System.out.println("Met2 Tanar");
    }

    public void metoda3() {
        System.out.println("Met3 Tanar");
        metoda1();
    }
}
