package karan;

public class p11 {

	public static void main(String[] args) {
		int a[]= {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int maxsum=0;
		int currsum=0;
		for(int i=0;i<a.length;i++)
		{
			rotate(a);
			currsum=findsum(a);
			if(currsum>maxsum)
			{
				maxsum=currsum;
			}
		}
		System.out.println(maxsum);

	}
	static void rotate (int []a)
	{
		int temp=a[1];
		for(int i=0;i<a.length-1;i++ )
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
	static int findsum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]* (i+1);
		}
		return sum;
	}

}
