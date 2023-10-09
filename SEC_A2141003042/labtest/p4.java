package LIT2;

public class p4 
{
    void m1(int a , int b)
    {
        System.out.println("m1() method ...........");
        System.out.println("___________________");
        System.out.println("Addition = "+(a+b));
    }
    public static void main(String[] args) 
    {
        p4 t = new p4();
        t.m1(10 , 20);

        int x=100,y=200;
        t.m1(x,y);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter first parameter value : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second parameter value : ");
        int num2 = sc.nextInt();
        t.m1(num1,num2);

        
    }
    
}
