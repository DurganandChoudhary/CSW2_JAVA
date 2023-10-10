package ASSIGNMENT;

//ASSIGNMENT : 2

class Student 
{
    static void m1(int x,char ch)
    {
        System.out.println("m1() method...........");
        System.out.println("===================");
        System.out.println("The value of x = "+x);
        System.out.println("The value of ch = "+ch);
        System.out.println();

    }
    void m2(double d , byte b)
    {
        System.out.println("m2() method............");
        System.out.println("=========================");
        System.out.println("The value of d = "+d);
        System.out.println("The value of b = "+b);
        System.out.println();
    }
    static void m3(short s , String str)
    {
        System.out.println("m2() method ........");
        System.out.println("=======================");
        System.out.println("The value of s = "+s);
        System.out.println("The value of str = "+str);
        System.out.println();
    }
    void m4(long l,int i,float k)
    {
        System.out.println("m3() method ..........");
        System.out.println("=======================");
        System.out.println("The value of l = "+l);
        System.out.println("The value of i = "+i);
        System.out.println("The value of k = "+k);
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Student.m1(10, '$');
        Student st = new Student();
        st.m2(1.1, (byte)9);
        Student.m3((short)5, "Rahul");
        st.m4(456936, 55, 4.56f);


        
    }
    
}
