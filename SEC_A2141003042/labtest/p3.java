package LIT2;

public class p3 
{

    static void Test()
    {
        System.out.println("Test method");
    }

    public static void main(String[] args) 
    {
        Test();
        p3.Test();
        p3 t = new p3();
        t.Test();
        
    }
    
}
