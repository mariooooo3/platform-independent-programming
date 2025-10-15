package lab02;
import java.util.ArrayList;

public class GrupaArrayList
{
    public int nr_studenti;
    public ArrayList<Student> studenti;

    public GrupaArrayList(int nr_studenti)
    {
        this.nr_studenti = nr_studenti;
        studenti = new ArrayList<>(nr_studenti);
    }

    public void add(Student s)
    {
        studenti.add(s);
    }
}