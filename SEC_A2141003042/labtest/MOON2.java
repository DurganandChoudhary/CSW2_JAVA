class Demo
{

}
class X
{

}
class Y
{

}
class Dog
{

}
class Chasma
{

}
class Puppy
{

}
public class MOON2 
{
    void m1(Demo d,X x,Y y)
    {
        System.out.println("m1() method.....");
        System.out.println("=================");
        System.out.println("The value of d= "+d);
        System.out.println("The value of X= "+x);
        System.out.println("The value of y= "+y);
    }
    static void m2(Chasma c,Dog d,Puppy p)
    {
        System.out.println("m2() method.......");
        System.out.println("======================");
        System.out.println("The value of c = "+c);
        System.out.println("The value of d = "+d);
        System.out.println("The value of p= "+p);
    }
    void m3(int i,boolean b ,MOON2 m)
    {
        System.out.println("m3() method...........");
        System.out.println("========================");
        System.out.println("The value of ch = "+i);
        System.out.println("The value of b = "+b);
        System.out.println("The value of m = "+m);
    }
    public static void main(String[] args)
    {
        MOON2 obj = new MOON2();
        Demo d1 = new Demo();
        X x = new X();
        Y y = new Y();
        obj.m1(d1, x, y);

        System.out.println();

        Chasma andha = new Chasma();
        Dog kuta = new Dog();
        Puppy bhobho = new Puppy();

        MOON2.m2(andha, kuta, bhobho);

        System.out.println();

        obj.m3('u', false, obj);
        
    }
    
}
