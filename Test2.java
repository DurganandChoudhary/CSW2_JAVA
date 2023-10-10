package ASSIGNMENT;
//Assignment 1

class Test2 
{
    static void m1()
    {
        System.out.println("m1() method.....");
        //System.out.println("=====================");
        System.out.println();

    }
    static void m2()
    {
        System.out.println("m2() method ...............");
        System.out.println("==========================");
        System.out.println();


    }
    void m3()
    {
        System.out.println("m3() method...........");
        //System.out.println("===========================");

        Test2.m1();
        Test2.m2();
        System.out.println();


    }
    void m4()
    {
        System.out.println("m4() method .............");
        //System.out.println("============================");
        
        Test2.m1();
        Test2.m2();
        System.out.println();


    }
    public static void main(String[] args) 
    {
        Test2 t = new Test2();
        t.m3();
        t.m4();

        
    }
    
}
