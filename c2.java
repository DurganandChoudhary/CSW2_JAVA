package Constructo;

public class c2 {

    void m1()
    {
        System.out.println("m1() method ....");
    }
    void m2()
    {
        System.out.println("m2 method.....");
    }
    void m3()
    {
        System.out.println("m3 method....");
    }
    c2()
    {
        System.out.println("c2() constructor....");

    }

    public static void main(String[] args) 
    {
        c2 c = new c2();
        c.m1();
        c.m2();
        c.m3();

        System.out.println("==========================");

        new c2().m1();
        new c2().m2();
        new c2().m3();


        
    }
    
}
