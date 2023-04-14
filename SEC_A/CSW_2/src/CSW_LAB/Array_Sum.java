package CSW_LAB;

// Write a Java Program that takes an integer array as input and returns the sum of all elements of the array.

public class Array_Sum {

	public static void main(String[] args) {
		
		int a[]= {4,9,6,7,3,1};
		int sum=0;
		
		for (int i=0;i<=a.length;i++)
		{
			sum=sum+a[i];
			System.out.println(sum);
		}
		

	}

}
