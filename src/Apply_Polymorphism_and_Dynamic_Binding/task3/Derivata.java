package Apply_Polymorphism_and_Dynamic_Binding.task3;

public class Derivata extends Parinte {
    int numar = 10;

    Derivata() {
        System.out.println("Constructor Derivata");
    }

    void print() {
        System.out.println(this.numar);
    }
}
