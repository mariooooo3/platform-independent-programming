package lab05;

import java.util.Hashtable;

public class Prb2 {
    public static void main(String[] args) {
        String nr_pi_100 = "3.1415926535897932384626433832795028841971693993"

                + "751058209749445923078164062862089986280348253421170679";
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();


        String nr = nr_pi_100.replace(".", "");

        for (int i = 0; i < nr.length(); i++) {
            String douaCifre = nr.substring(i, i + 2);

        }
    }
}