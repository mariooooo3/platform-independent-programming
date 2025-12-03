package Implement_Inheritance_and_Composition;

import Implement_Inheritance_and_Composition.work.Adauga;
import Implement_Inheritance_and_Composition.work.Agregat;
import Implement_Inheritance_and_Composition.work.Piesa;
import Implement_Inheritance_and_Composition.work.Sistem;
import Implement_Inheritance_and_Composition.work.Subsistem;

public class TestPrb2 {
    public TestPrb2() {
        System.out.println("Constructor TestPrb2 apelat");
    }

    public static void main(String[] argv) {
        Sistem sistem = new Sistem();
        Adauga adauga = new Adauga(sistem);
        Piesa p1 = new Piesa();
        Piesa p2 = new Piesa();
        Piesa p3 = new Piesa();
        Agregat a1 = new Agregat();
        Agregat a2 = new Agregat();
        Subsistem s1 = new Subsistem();

        adauga.add(p1);
        adauga.add(p2);
        adauga.add(p3);
        adauga.add(a1);
        adauga.add(a2);
        adauga.add(s1);

    }
}

