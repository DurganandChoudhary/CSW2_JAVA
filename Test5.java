package Constructo;

public class Test5 
{
    static
    {
        System.out.println("static block 1");
        Test5 t = new Test5();
        t.m1(100, 45);
        
    }
    {
        System.out.println("non static block 1");
    }
    Test5()
    {
        System.out.println("Test5() constructor....");
    }
    void m1(int a, int b)
    {
        System.out.println("m1() method execution....");
        System.out.println("======================");
        System.out.println("Addition = "+(a+b));
    }
    public static void main(String[] args) {
        
        System.out.println("main() method execution....");
        Test5 t = new Test5();
        t.m1(45, 50);
    }
    static
    {
        System.out.println("static block 2");
    }
    {
        System.out.println("non static block 2");
    }
  
    
}
