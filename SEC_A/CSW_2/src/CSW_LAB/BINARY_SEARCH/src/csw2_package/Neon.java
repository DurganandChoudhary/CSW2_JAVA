package csw2_package;
import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=in.nextInt();
		int temp=n*n;int sum=0;
		while(temp!=0)
		{
			int d=temp%10;
			sum=sum+d;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println("Neon no.");
		else
			System.out.println("Not neon no.");

	}

}
