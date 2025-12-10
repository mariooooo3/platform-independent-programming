package In_Out_Data_Streams;

import java.io.RandomAccessFile;
import java.io.File;

public class TestPrb3 {

    private static final String FILENAME = "aleator.dat";

    public static void main(String[] args) throws Exception {
        task1();
        task2();
        task3();
    }

    public static void task1() throws Exception {
        System.out.println("--- Task 1: Scrierea initiala in fisier ---");
        try (RandomAccessFile aleator = new RandomAccessFile(FILENAME, "rw")) {
            aleator.writeDouble(2.37);
            aleator.writeDouble(3.17);
            aleator.writeBoolean(true);
            aleator.writeInt(4);
            aleator.writeInt(2);
            aleator.writeFloat(8.14f);

            aleator.seek(0);
            System.out.println("2x Double: " + aleator.readDouble() + ", " + aleator.readDouble());
            System.out.println("1x Boolean: " + aleator.readBoolean());
            System.out.println("2x Int: " + aleator.readInt() + ", " + aleator.readInt());
            System.out.println("1x Float: " + aleator.readFloat());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void task2() throws Exception {
        System.out.println("\n--- Task 2: Citire selectiva ---");
        try (RandomAccessFile aleator = new RandomAccessFile(FILENAME, "r")) {
            aleator.seek(16);

            int valInt1 = aleator.readInt();
            int valInt2 = aleator.readInt();

            System.out.println("Valorile Int: " + valInt1 + ", " + valInt2);

            aleator.seek(16);

            boolean valBool = aleator.readBoolean();
            System.out.println("Valoarea Boolean: " + valBool);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void task3() throws Exception {
        System.out.println("\n--- Task 3: Actualizare si Citire completa ---");
        try (RandomAccessFile aleator = new RandomAccessFile(FILENAME, "rw")) {
            aleator.seek(17);

            int valInt1 = aleator.readInt();
            int newValInt1 = valInt1 + 1;

            aleator.seek(17);
            aleator.writeInt(newValInt1);

            aleator.seek(21);

            int valInt2 = aleator.readInt();
            int newValInt2 = valInt2 + 1;

            aleator.seek(21);
            aleator.writeInt(newValInt2);

            System.out.println("Valori Int actualizate: " + newValInt1 + ", " + newValInt2);

            aleator.seek(0);
            System.out.println("\nContinutul final al fisierului:");
            System.out.println("2x Double: " + aleator.readDouble() + ", " + aleator.readDouble());
            System.out.println("1x Boolean: " + aleator.readBoolean());
            System.out.println("2x Int: " + aleator.readInt() + ", " + aleator.readInt());
            System.out.println("1x Float: " + aleator.readFloat());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            new File(FILENAME).delete();
        }
    }

}