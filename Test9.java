public class Test9 {

    void m1(int a)
    {
        System.out.println("m1 method with int");
        System.out.println("===================");
        System.out.println("the value of a = "+a);
    }
    static void m2(int i,double d)
    {
        System.out.println("m2 method with int double");
        System.out.println("============================");
        System.out.println("the value of i is "+i);
        System.out.println("the value of d is "+d);
    }
    void m3(String s , char ch)
    {
        System.out.println("m3 method with string and char");
        System.out.println("================================");
        System.out.println("the value of s = "+s);
        System.out.println("the value of ch = "+ch);
    }
    public static void main(String[] args) {
        
        Test9 t = new Test9();
        t.m1(10);
        System.out.println();
        Test9.m2(20,4.5);
        System.out.println();
        t.m3("moon", 'k');
    }
    
}
