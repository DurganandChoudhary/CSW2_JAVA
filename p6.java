package karan;

public class p6 {

	public static void main(String[] args) {
		int a[]= {1,-2,3,4,-4,6,-4,3,2};
		int maxsum=a[0];
		int csum=0;
		for(int i=0;i<a.length;i++)
		{
			if(csum<0)
			{
				csum=0;
			}
			csum=csum+a[i];
			if(csum>maxsum)
			{
				maxsum=csum;
			}
		}
		System.out.println(maxsum);

	}

}
