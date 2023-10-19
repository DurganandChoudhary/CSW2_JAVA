package Abstract;

abstract class PahadSinghFamily 
{
    abstract void sunil();

    void jyoti()
    {
        System.out.println("Jyoti is already complete...");
    }
    class JenaFamily extends PahadSinghFamily
    {
        void sunil()
        {
            System.out.println("Now sunil is complete....");
        }

        public static void main(String[] args) {
            
            JenaFamily jf = new JenaFamily();
            jf.sunil();
            jf.jyoti();

        }
    }
    
}
