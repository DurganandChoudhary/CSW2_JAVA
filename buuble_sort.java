package karan;

public class buuble_sort {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,8};
		int swapped=1;
		for(int i=0;i<a.length-1&&swapped==1;i++)
		{
			swapped=0;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=1;
				}
			}
			display(a);
		}
		

	}
	//time complexity O()
	public static void display(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}

}
