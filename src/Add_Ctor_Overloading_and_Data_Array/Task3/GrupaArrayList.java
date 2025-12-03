package Add_Ctor_Overloading_and_Data_Array.Task3;

import Add_Ctor_Overloading_and_Data_Array.Task1.Student;

import java.util.ArrayList;

public class GrupaArrayList {
    public int nr_studenti;
    public ArrayList<Student> studenti;

    public GrupaArrayList(int nr_studenti) {
        this.nr_studenti = nr_studenti;
        studenti = new ArrayList<>(nr_studenti);
    }

    public void add(Student s) {
        studenti.add(s);
    }


    public void print() {
        for (int i = 0; i < studenti.toArray().length; i++) {
            System.out.println(studenti.get(i).numeStudent);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Chris", 3);
        Student s2 = new Student("Gabi", 2);
        Student s3 = new Student("Denis", 3);
        Student s4 = new Student("Gabi", 3);

        GrupaArrayList grupa = new GrupaArrayList(5);
        grupa.add(s1);
        grupa.add(s2);
        grupa.add(s3);
        grupa.add(s4);
        grupa.print();
    }
}