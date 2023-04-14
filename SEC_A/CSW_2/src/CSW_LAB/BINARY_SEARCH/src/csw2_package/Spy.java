package csw2_package;
import java.util.*;
public class Spy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=in.nextInt();
		int temp=n;int sum=0,prod=1;
		while(temp!=0)
		{
			int d=temp%10;
			sum=sum+d;
			prod=prod*d;
			temp=temp/10;
			
		}
		if(sum==prod)
			System.out.println("SPY no.");
		else
			System.out.println("Not SPY no.");
				
		
	}

}
