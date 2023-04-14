package karan;

public class p9 {

	public static void main(String[] args) {
		//sort from one to n
		int a[]= {1,7,5,8,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			

	}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

}
}

