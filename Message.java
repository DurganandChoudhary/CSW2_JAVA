package Abstract;

abstract class Message {
    abstract void m1();

    void m2()
    {
        System.out.println("m2() method....");
    }

    public static void main(String[] args) {

        Message m = new Message() 
        {
            void m1()
            {
                System.out.println("m1() method....");
            }
        };
        Message obj = new Message() 
        {
            void m1()
            {
                System.out.println("m1().......");
            }
            
        };
        m.m1();
        m.m2();
        obj.m1();
        
    }
    
}
