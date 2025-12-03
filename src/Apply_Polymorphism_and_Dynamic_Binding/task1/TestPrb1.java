package Apply_Polymorphism_and_Dynamic_Binding.task1;

public class TestPrb1 {
    public static void printAutomobil(Autovehicul a) {
        System.out.println("Print Autovehicul");
    }

    public static void main(String[] args) {
        Berlina b = new Berlina();
        b.tipAutomobil();
        b.printBerlina();

        System.out.println("- 1. -");
        Autovehicul s = new Sport();
        s.tipAutomobil();
        ((Sport) s).printSport();
        System.out.println("- 2. -");
        Object m = new Sport();
        ((Autovehicul) m).tipAutomobil();

        TestPrb1.printAutomobil(b);
        TestPrb1.printAutomobil(s);
        TestPrb1.printAutomobil((Autovehicul) m);

    }

}
