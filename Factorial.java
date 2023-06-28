import java.util.Scanner;
public class Factorial
{
	public static int calcfact(int n)
	{
	if(n== 0 || n==1 )
	{
	return 1;
	}
	int fact1=calcfact(n-1);
	int fact=n*fact1;
	return fact;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	int ans=calcfact(n);
	System.out.println("Factorial of "+n+" is :"+ans);
	}
}