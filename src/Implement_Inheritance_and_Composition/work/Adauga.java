package Implement_Inheritance_and_Composition.work;

public class Adauga {
    Sistem sistem = new Sistem();

    public Adauga(Sistem sistem) {
        this.sistem = sistem;
        System.out.println("Constructor Adauga apelat");
    }

    public Adauga add(Piesa piesa) {
        sistem.piese[0] = piesa;
        return this;

    }

    public Adauga add(Agregat agregat) {
        sistem.agregate[0] = agregat;
        return this;
    }

    public Adauga add(Subsistem subsistem) {
        sistem.subsisteme[0] = subsistem;
        return this;
    }

}
