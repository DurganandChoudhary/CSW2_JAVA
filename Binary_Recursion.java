import java.util.Scanner;
public class Binary_Recursion 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        Binary_Recursion obj = new Binary_Recursion();
        String m = obj.Binary(n);
        System.out.println("Answer:"+m);
    }
    String Binary(int x)
    {
        if(x > 0)
        {
            int a = x % 2;
            x = x / 2;
            return a + "" + Binary(x);
        }
        return "";
    }
}