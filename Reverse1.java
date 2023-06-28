import java.util.Scanner;
class Reverse1
{
    public static void reverse(int n)
    {
        if(n<10)
        {
        System.out.println(n);
        return;
    }
    else
    {
        System.out.print(n%10);
        reverse(n/10);
    }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Digits:");
        int n=sc.nextInt();
        System.out.print("Reversed digits is:");
        reverse(n);
    }
}