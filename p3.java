package karan;
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("input size of the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter k");
    int k=sc.nextInt();
    rotatek(a,k);
	}
	static void rotatek(int []a,int k)
	{
		for(int i=0;i<k;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
