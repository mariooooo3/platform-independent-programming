package lab02;

public class TestPrb1 {
    public static void main(String[] args) {
        Student s1 = new Student("Claudiu", 2);
        Student s2 = new Student(2344, "Mario");
        Student s3 = new Student(2134, "Darius", 3);
        Student s4 = s3;
        Student s5 = new Student(s1, 2321);

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();


    }
}
