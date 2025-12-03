package Integrate_Data_Structures_and_Iterators;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Prb2 {
    public static void main(String[] args) {
        String nr_pi_100 = "3.1415926535897932384626433832795028841971693993"

                + "751058209749445923078164062862089986280348253421170679";
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();


        String nr = nr_pi_100.replace(".", "");

        for (int i = 0; i < nr.length() - 1; i++) {
            String douaCifre = nr.substring(i, i + 2);
            if (hash.containsKey(douaCifre)) {
                int frecventaCurenta = hash.get(douaCifre);
                hash.put(douaCifre, frecventaCurenta + 1);
            } else
                hash.put(douaCifre, 1);
        }

        Set<Map.Entry<String, Integer>> intrari = hash.entrySet();

        for (Map.Entry<String, Integer> entry : intrari) {
            String cheie = entry.getKey();
            int valoare = entry.getValue();
            System.out.println("Perechea **" + cheie + "** apare de **" + valoare + "** ori.");
        }
        String cheieMaxima = "";
        int valoareMaxima = -1;


        for (Map.Entry<String, Integer> intrare : intrari) {
            String cheieCurenta = intrare.getKey();
            int valoareCurenta = intrare.getValue();


            if (valoareCurenta > valoareMaxima) {
                valoareMaxima = valoareCurenta;
                cheieMaxima = cheieCurenta;
            }
        }
        System.out.println("Numărul format din două cifre consecutive care se repetă cel mai mult este:");
        System.out.println("Perechea: **" + cheieMaxima + "**");
        System.out.println("Frecvența: **" + valoareMaxima + "** ori.");

    }
}