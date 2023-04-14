package karan;

import java.util.Arrays;

public class p8 {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,-1,-1};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(i==a[j])
			{
				swap(i,j,a);
				count=1;
			}
		}
		if(count!=1)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==-1)
				{
					swap(i,j,a);
				}
				
			}
		}
		}
		for(int i=0; i<a.length;i++)
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
