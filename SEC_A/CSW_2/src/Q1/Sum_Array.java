package Q1;

public class Sum_Array {
	static int a[]= {4,9,6,7,3,1};

	
	static int sum()
	{
		int sum = 0; 
		int i;

		
		for (i = 0; i < a.length; i++)
			sum += a[i];

		return sum;
	}

	
	public static void main(String[] args)
	{
		System.out.println("Sum of given array is "+ sum());
	}
}
