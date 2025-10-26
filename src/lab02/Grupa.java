package lab02;

public class Grupa {
    public int nr_studenti;
    public Student[] studenti;

    public Grupa(int nr_studenti) {
        this.nr_studenti = nr_studenti;
        studenti = new Student[nr_studenti];
    }

    public Grupa(int nr_studenti, Student[] studenti) {
        this.nr_studenti = nr_studenti;
        this.studenti = studenti;
    }

    public void add(Student s, int pozitie) {
        if (pozitie >= 0 && pozitie <= nr_studenti) {
            studenti[pozitie] = s;
        } else
            System.out.println("Pozitia nu este valida");
    }

    public void print() {
        if (studenti == null)
            System.out.println("Nu exista niciun student in aceasta grupa");
        else {
            for (int i = 0; i < studenti.length; i++) {
                if (studenti[i] == null)
                    break;
                else {
                    System.out.println("Studentul cu numarul " + (i + 1) + " este:" +
                            studenti[i].numeStudent);
                }
            }
        }
    }

}



