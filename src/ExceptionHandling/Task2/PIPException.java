package ExceptionHandling.Task2;

public class PIPException extends Exception {
    private static final long serialVersionUID = 0L;
    private String mesaj = "PIP exception";

    PIPException(String mesaj) {
        super(mesaj);
        this.mesaj = mesaj;

    }

    void print() {
        System.out.println(mesaj);
    }


}