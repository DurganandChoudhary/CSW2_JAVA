//Q1
import java.util.Scanner;
class Commission
{
	double sales;
	
	Commission(double sales)
	{
		this.sales=sales;
	}
	void getCommission()
	{
		double comm=0.0;
		if(sales<500)
			comm=0.02*sales;
		else if(sales>=500&&sales<5000)
			comm=0.05*sales;
		else
			comm=0.08*sales;
		System.out.println("Commission= "+comm);
	}
}
public class Commission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Sales");
		double s=sc.nextDouble();
		
		if(s>=0)
		{
		Commission ob=new Commission(s);
		ob.getCommission();
	}
	else
	    System.out.println("Invalid sales");
}
}
