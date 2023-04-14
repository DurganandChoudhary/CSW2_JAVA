package karan;
import java.util.*;
public class p4 {

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
    RotateArray(a,k);
    for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
	static void RotateArray(int []a,int k)
	{
		ReverseArray(a,0,k-1);
		ReverseArray(a,k,a.length-1);
		ReverseArray(a,0,a.length-1);
			
		}
	static void ReverseArray(int a[],int i,int j)
	{
		int temp=a[i];
		for(;i<j;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		
	}
	

}