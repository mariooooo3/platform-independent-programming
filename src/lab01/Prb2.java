package lab01;

public class Prb2 {

    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int b = 2; b <= 5; b++) {
                for (int c = 2; c <= 4; c++) {
                    for (int d = 3; d <= 5; d++) {
                        int e = 0;
                        if (c < 3)
                            e = c + 2;
                        if (c > 3)
                            e = c - 2;
                        if (c == 3)
                            e = c + -2;
                        if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e
                                && d != e)
                            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
                    }
                }
            }

        }
    }

}
