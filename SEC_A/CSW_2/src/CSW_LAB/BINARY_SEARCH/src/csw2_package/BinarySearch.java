package csw2_package;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a[]=new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENter a no. to search");
		int s =in.nextInt();
		if(binary(a,0,9,s))
		{
			System.out.println("yes");
		}else
			System.out.println("no");
	}
		
	static boolean binary(int a[],int i,int l,int s)
	{
		int mid=0;
		mid=(i+l)/2;
		if(i==l)
			mid=i;
		if(s==a[mid])
			return true;
		else if(s>a[mid]) 
			return binary(a,mid+1,l,s);
		else if(s<a[mid])
				return binary(a,i,mid-1,s);
		
		return false;
		
	
	}

}
