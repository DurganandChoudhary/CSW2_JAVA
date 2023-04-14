package csw2_package;
import java.util.*;
public class Armstrong {
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=in.nextInt();
		int temp=n;int c=0;int a[]=new int[10];
		while(temp!=0)
		{
			int d=temp%10;
			a[c]=d;
			c++;
			temp=temp/10;
			
		}
		int sum=0;
		for(int i=0;i<c;i++)
		{
			sum=sum+sumk(c, a, i);
		}
		if(sum==n)
			System.out.println("Armstrong no.");
		else
			System.out.println("Not an Armstrong no.");
		
	}
	static int sumk(int c,int a[],int i)
	{
		if(c==1)
			return a[i];
		else {
		return	a[i]*sumk(c-1,a,i);
		}
		
	}

}
