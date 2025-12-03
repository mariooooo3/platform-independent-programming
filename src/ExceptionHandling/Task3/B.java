package ExceptionHandling.Task3;

public class B {
    static int x = 0;

    void f() throws E1, E2, E3 {
        try {
            A a = new A();
            a.g();
        } catch (E1 | E2 | E3 e) {
            System.out.println("\nExceptie prinsa in clasa B:");
            x = e.hashCode();
            System.out.println(e);
            System.out.println(x);
            throw e;

        }
    }
}