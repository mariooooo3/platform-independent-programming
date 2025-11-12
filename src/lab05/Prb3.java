package lab05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prb3 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 4, 5, 2, 8);
        boolean same = false;
        boolean set = false;

        for (int i = 0; i < lista.size() - 1; i++)
            for (int j = 0; j < lista.size() - i - 1; j++)
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
        System.out.println("\nLista sortata este: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        System.out.println("\nMetoda 1");
        for (int i = 0; i < lista.size() - 1; i++)
            if (lista.get(i).equals(lista.get(i + 1)))
                same = true;

        if (same)
            System.out.println("Lista nu are elemente unice");
        else
            System.out.println("Lista are elemente unice");

        System.out.println("\nMetoda 2");
        Set<Integer> setUnic = new HashSet<>(lista);
        if (setUnic.size() == lista.size())
            set = true;

        if (set)
            System.out.println("Lista are elemente unice");
        else
            System.out.println("Lista nu are elemente unice");

    }
}