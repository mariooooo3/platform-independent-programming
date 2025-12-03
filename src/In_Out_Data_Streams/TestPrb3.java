package In_Out_Data_Streams;

import java.io.RandomAccessFile;

public class TestPrb3 {
    public static void main(String[] args) throws Exception
    {
        try(RandomAccessFile aleator = new RandomAccessFile("aleator.dat", "rw"))
        {
            aleator.writeDouble(2.37);
            aleator.writeDouble(3.17);
            aleator.writeBoolean(true);
            aleator.writeInt(4);
            aleator.writeInt(2);
            aleator.writeFloat(8.14f);
            aleator.read();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }


}


