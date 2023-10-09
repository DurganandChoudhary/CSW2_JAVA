public class Cricket 
{
    String cricketer = "Smith";

    void indiaTeam(String cricketer)
    {
        System.out.println("Cricketer name is : "+cricketer);
        System.out.println("Cricketer name is : "+this.cricketer);

    }
    public static void main(String[] args)
    {
        Cricket game = new Cricket();
        game.indiaTeam("Kohli");
    }
    
}
