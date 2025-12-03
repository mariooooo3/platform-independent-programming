package Add_Ctor_Overloading_and_Data_Array.Task2;

public class Ini {
    static Test t1 = new Test("t1");
    Test t2 = new Test("t2");

    public Ini(String s) {
        Test t3 = new Test(s);
        System.out.println("Constructor Ini");
    }

    static Test t4 = new Test("t4");

}
