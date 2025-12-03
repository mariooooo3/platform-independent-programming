package Add_Ctor_Overloading_and_Data_Array.Task1;

public class Student {
    public float numarMatricol;
    public String numeStudent;
    public int anStudiu;

    public Student(String numeStudent, int anStudiu) {
        this.anStudiu = anStudiu;
        this.numeStudent = numeStudent;
        this.numarMatricol = 0;
    }

    public Student(long numarMatricol, String numeStudent) {
        this.numarMatricol = numarMatricol;
        this.numeStudent = numeStudent;
        this.anStudiu = 1;
    }

    public Student(long numarMatricol, String numeStudent, int anStudiu) {
        this.numarMatricol = numarMatricol;
        this.anStudiu = anStudiu;
        this.numeStudent = numeStudent;
    }

    public void printStudent() {
        System.out.println("Numele studentului este " + this.numeStudent + " cu numarul matricol: " + this.numarMatricol
                + " aflat in anul de studiu: " + this.anStudiu);
        if (isValidStudent(this))
            System.out.println("Studentul este valid");
        else
            System.out.println("Studentul nu este valid");

    }

    public Student(Student s) {
        this.anStudiu = s.anStudiu;
        this.numarMatricol = s.numarMatricol;
        this.numeStudent = s.numeStudent;

    }

    public Student(Student s, long numarMatricol) {
        this.anStudiu = s.anStudiu;
        this.numeStudent = s.numeStudent;
        this.numarMatricol = numarMatricol;
    }

    //@Override
    public Student(String numeStudent, float numarMatricol) {
        this.numeStudent = numeStudent;
        this.numarMatricol = numarMatricol;
    }

    public boolean isValidStudent(Student s) {
        if (s.anStudiu == 1 || s.numarMatricol == 0)
            return false;
        else
            return true;

    }
}
