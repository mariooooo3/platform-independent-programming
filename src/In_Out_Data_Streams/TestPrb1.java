package In_Out_Data_Streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestPrb1 {

    static void task1() throws IOException
    {
//		FileInputStream fluxIntrare = new FileInputStream("C:\\Users\\Student\\Desktop\\1301A\\PIP2025\\src\\lab09\\int.txt");
//
//		int c = fluxIntrare.read();
//		System.out.println(c);
//
//		BufferedInputStream buff = new BufferedInputStream(fluxIntrare);

        File f = new File("C:\\Users\\Student\\Desktop\\1301A\\PIP2025\\src\\lab09\\int.txt");
        FileReader cititor = new FileReader(f);

        BufferedReader flux = new BufferedReader(cititor);

        String r;
        while((r = flux.readLine()) != null)
            System.out.println(r);
    }

    static void task2() throws IOException
    {
        File f = new File("C:\\\\Users\\\\Student\\\\Desktop\\\\1301A\\\\PIP2025\\\\src\\\\lab09\\\\int.txt");
        FileReader cititor = new FileReader(f);

        BufferedReader flux = new BufferedReader(cititor);

        StringBuilder continut = new StringBuilder();
        String r;
        while((r = flux.readLine()) != null)
        {
//			System.out.println(r);
            continut.append(r);
            continut.append("\n---------\n");
        }
        System.out.println(continut);
        File outFile = new File("C:\\Users\\Student\\Desktop\\1301A\\PIP2025\\src\\lab09\\out.txt");
        BufferedWriter write = new BufferedWriter(new FileWriter(outFile));

    }

    public static void main(String[] args) throws IOException
    {
//		task1();
        task2();
    }
}