package LIT2;

public class p1 {

    void m1()
    {
        System.out.println("m1 method with int");
        System.out.println("=====================");
        System.out.println("the value of a = "+a);
    }
    static void m2(int i,double d)
    {
        System.out.println("m2 method with int double");
        System.out.println("============================");
        System.out.println("the value of i = "+i);
        System.out.println("the value of d = "+d);
    }
    void m3(String s,char ch)
    {
        System.out.println("m3 method with string and character");
        System.out.println("======================================");
        System.out.println("the value of s = "+s);
        System.out.println("the value of ch = "+ch);
    }

    
    public static void main(String[] args) {
        p1 t = new p1();
        t.m1(10);
        System.out.println();

        p1.m2(142,45.36);
        System.out.println();
        
        t.m3("moon", 'k');
        
    }
    public void m2(int i) {
    }
    public void m3(int i, String string) {
    }
    
}
