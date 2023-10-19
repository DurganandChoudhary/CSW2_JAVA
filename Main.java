package Factory;

class Test{
    int x=10;
}
class Demo
{
    int y=20;
    private Demo()
    {

    }
    static Demo getObjectofDemo()
    {
        Demo d = new Demo();
        return d;
    }
    Test getObjectofTest()
    {
    Test t = new Test();
    return t;
    }
}

class Main {
    public static void main(String[] args) 
    {
        Demo d1 = Demo.getObjectofDemo();
        System.out.println("The value of y = "+d1.y);
        System.out.println();

        Test t1 = d1.getObjectofTest();
        System.out.println("The value of x ="+t1.x);
        
    }
    
}
