package In_Out_Data_Streams;

import java.util.Scanner;

public class TestPrb2 {

    String nume;
    String prenume;

    TestPrb2()
    {

    }

    void signIn()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele:");
        this.nume = scanner.nextLine().toUpperCase();
        System.out.println("Introduceti prenumele");
        this.prenume = scanner.nextLine().toUpperCase();
        System.out.println(nume + " " + prenume);
    }

    static void g1()
    {
        String l;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Transformati toUpperCase:");
        while((l = scanner.nextLine()) != "")
        {
            System.out.println(l.toUpperCase());
        }
    }

    public static void main(String[] args)
    {
        TestPrb2 test = new TestPrb2();
        test.signIn();
        g1();
    }
}