package lab06.Task3;

public class TestPrb3 {
    public static void main(String[] args) throws E1, E2, E3
    {
        try{
            B b = new B();
            b.f();
        }catch(E1 | E2 | E3 e)
        {
            System.out.println("\nExceptie prinsa in main:");
            System.out.println(e);
            System.out.println(e.hashCode());

            if(e.hashCode() == B.x)
                System.out.println("\nAceeasi exceptie, acelasi hashCode");
            else
                System.out.println("\nExceptiile sunt diferite si au hashCode diferit");

        }
    }
}
