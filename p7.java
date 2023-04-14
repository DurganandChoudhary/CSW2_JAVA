package karan;

import java.util.Arrays;

public class p7 {

	public static void main(String[] args) {
		int a[]= {3,8,4,1,6,7};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(i%2==0 && a[i]<a[i+1] )
			{
				swap(i,i+1,a);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	static void swap(int a, int b, int []c)
	{
		int temp=c[a];
		c[a]=c[b];
		c[b]=temp;
	}

}
