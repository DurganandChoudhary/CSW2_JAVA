package Exception;

import java.util.Scanner;

public class Test 
{
    public static boolean vote(int a) throws Exception
    {
        if(a<10)
        {
            throw new Exception("Please enter a valid age.");
        }
        return true;
    }
    public static void main(String[] args) {
        
        try{
            System.out.println("Enter age : ");
            int age = new Scanner (System.in).nextInt();
            boolean status = vote (age);
            System.out.println(status);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
