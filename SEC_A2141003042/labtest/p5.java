package LIT2;

public class p5 {

    void m1()
    {
        System.out.println("m1() method......");
    }
    int m2()
    {
        System.out.println("m2() method .........");
        return 10;
    }
    char m3()
    {
        System.out.println("m3() method .....");
        return 'k';
    }
    double m4()
    {
        System.out.println("m4() method .........");
        return 4.55;
    }
    boolean m5()
    {
        System.out.println("m5() method...");
        return false;
    }
    public static void main(String[] args) {
        
        p5 t = new p5();
        t.m1();
        System.out.println("m1() method returns nothing....");

        System.out.println();

        int x=t.m2();
        System.out.println("m2() returns value = "+x);

        System.out.println();

        char ch = t.m3();
        System.out.println("m3() method returns value = "+ch);
        System.out.println();

        double d = t.m4();
        System.out.println("m4() returns the value = "+d);
        System.out.println();

        boolean b = t.m5();
        System.out.println("m5() returns the value ...."+b);

    }

    
}

