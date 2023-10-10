package ASSIGNMENT;

//ASSIGNMENT 3

class Emp{}
class X{}
class Y{}
class Z{}
class Student{}
class M{}
class Pen{}
class Book{}
class Snake{}
class Bat{}
class Ball{}
class Field{}
class Test{}
class Chasma{}


class Employee 
{

    String empDetails(Emp e, X x,Y y)
    {
        System.out.println("Method = empDetails()");
        System.out.println("=======================");
        System.out.println("The value of e = "+e);
        System.out.println("The value of X = "+x);
        System.out.println("The value of Y = "+y);
        
        return "Rahul";

    }
    Student salaryDetails(double sal,Z z,M m)
    {
        System.out.println("Method = salaryDetails()");
        System.out.println("============================");
        System.out.println("The value of sal = "+sal);
        System.out.println("The value of Z = "+z);
        System.out.println("The value of M = "+m);
        return new Student();
    }

    Test addressDetails(Pen p,Book b,Snake s)
    {
        System.out.println("Method = addressDetails()");
        System.out.println("============================");
        System.out.println("The value of P = "+p);
        System.out.println("The value of b = "+b);
        System.out.println("The value of s = "+s);
        return new Test();
    }
    Chasma cricket(Bat bt,Ball bl,Field fl)
    {
        System.out.println("Method = Cricket()");
        System.out.println("======================");
        System.out.println("The value of bt = "+bt);
        System.out.println("The value of bl = "+bl);
        System.out.println("The value of fl = "+fl);
        return new Chasma();
    }

    public static void main(String[] args) 
    {
        Employee t = new Employee();

        Emp e = new Emp();
        X x = new X();
        Y y = new Y();
        
        String u = t.empDetails(e, x, y);
        System.out.println("empDetails return value = "+u);

        System.out.println();

        Z z = new Z();
        M m = new M();

        Student st = t.salaryDetails(7100.50, z, m);
        System.out.println("salaryDetails = "+st);

        System.out.println();

        Pen p = new Pen();
        Book b = new Book();
        Snake s = new Snake();

        Test ad = t.addressDetails(p, b, s);
        System.out.println("addressDetails = "+ad);

        System.out.println();

        Bat bt = new Bat();
        Ball bl = new Ball();
        Field fl = new Field();

        Chasma chr = t.cricket(bt, bl, fl);
        System.out.println("cricket = "+chr);
        
    }
    
}
