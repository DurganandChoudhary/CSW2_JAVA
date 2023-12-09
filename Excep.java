package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        try{
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Sum : "+(i+j)+" Div = "+(i/j));
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        sc.close();
        
    }
    
}
