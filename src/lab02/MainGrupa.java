package lab02;

public class MainGrupa {
    public static void main(String[] args) {
        Grupa grupa = new Grupa(5);

        Student s0 = new Student("Alin", 3);
        Student s2 = new Student("Claudiu", 2);
        Student s3 = new Student("Dan", 1);

        grupa.add(s0, 0);
        grupa.add(s2, 1);
        grupa.add(s3, 2);
        grupa.print();

        grupa.add(new Student("Chris", 3), 2);
        grupa.add(new Student("Gabi", 2),4);
        grupa.add(new Student("Denis", 3), 3);
        grupa.print();
    }
}
