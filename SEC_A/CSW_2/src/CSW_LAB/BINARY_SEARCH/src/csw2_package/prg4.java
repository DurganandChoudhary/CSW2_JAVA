package csw2_package;
import java.util.*;
public class prg4 {
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter two nos.");
		int n1=in.nextInt();
		int n2=in.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(prime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean prime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				return false;
			}
				
		}
			return true;
	}
}
