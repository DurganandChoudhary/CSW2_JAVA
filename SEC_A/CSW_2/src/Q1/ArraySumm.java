package Q1;

import java.util.Scanner;

public class ArraySumm {
	
	public static int findSum(int a[], int size) {
		int sum=0;
		for(int i=0; i<size; i++)
			sum +=a[i];
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		for(int i=0; i<n;i++) {
			a[i]=;
		}
		System.out.println(findSum(a,n));

	}

}
