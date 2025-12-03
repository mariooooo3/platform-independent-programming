package Implement_Inheritance_and_Composition.work;

public class TestPrb2 extends Adauga {
    public TestPrb2(Sistem s) {
        super(s);
        System.out.println("Constructor TestPrb2 apelat");
    }

    void addX() {
        Adauga adauga = new Adauga(sistem);
        Piesa p1 = new Piesa();
        adauga.add(p1);

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
        TestPrb2 test = new TestPrb2(sistem);
        test.addX();


    }
}
