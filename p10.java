package karan;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		int k=0;
		for(int i=0,j=a.length-1;i<j;i++,j--,k=k+2)
		{
			b[k]=a[j];
			b[k+1]=a[i];
			 
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}

	}
	
	static void swap(int a, int b, int []c)
	{
		int temp=c[a];
		c[a]=c[b];
		c[b]=temp;
	}

}
