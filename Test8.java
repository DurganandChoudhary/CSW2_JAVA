public class Test8 {

    void m1(int x,double d)
    {
        System.out.println("1");
    }
    void m1(double d , int k)
    {
        System.out.println("2");
    }
    
    public static void main(String[] args) {

        Test8 t = new Test8();
        t.m1(10, 45.3);
        t.m1(77.7, 77);
        
    }
}
