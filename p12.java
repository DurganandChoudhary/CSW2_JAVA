package karan;

public class p12 {

	public static void main(String[] args) {
	int a[]= {12,13,18,20,22,26,70};
	int b[]= {11,15,18,19,20,26,30,31};
	int i=0;
	int j=0;
	int sum1=0;
	int sum2=0;
	int maxsum=0;
	while(i<a.length&&j<b.length)
	{
		if(a[i]>b[j])
		{
			sum1=sum1+b[j];
			j=j+1;
		}
		else if(a[i]<b[j])
		{
			sum2=sum2+a[i];
			i=i+1;
		}
		else
		{
			maxsum=maxsum+Math.max(sum1,sum2)+a[i];
			i=i+1;
			j=j+1;
			sum1=0;
			sum2=0;
		}
	}
	while(i<a.length)
	{
	sum2=sum2+a[i];
	i+=1;
	}
	while(j<b.length)
	{
		sum1=sum1+b[j];
	}
	maxsum=maxsum+Math.max(sum1,sum2);
	
	System.out.println(maxsum);
}
}