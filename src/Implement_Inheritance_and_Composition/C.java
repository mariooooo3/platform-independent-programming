package Implement_Inheritance_and_Composition;

public class C extends A {
    String nume;
    B b = new B();

    public C(String nume) {
        super(nume);
        B b2 = new B();
        System.out.println("Constructor CCC apelat");
    }
}
