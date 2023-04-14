package karan;

public class p5 {

	public static void main(String[] args) {
		int a[]= {1,-2,3,4,-4,6,-4,3,2};
		int maxsum=0;
		int csum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{	csum=0;
				for(int k=i;k<=j;k++)
				{
					csum=csum+a[k];
				}
				if(csum>maxsum)
					maxsum=csum;
			}
		}
		System.out.println(maxsum);

	}

}
