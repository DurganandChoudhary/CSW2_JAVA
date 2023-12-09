package Exception;

import java.util.Scanner;

public class Test2 
{
    public static void main(String[] args) {
        
        try{
            // code for open a file
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally
        {
            System.out.println("clean up code ... for close the file");
        }
    }
    
}
