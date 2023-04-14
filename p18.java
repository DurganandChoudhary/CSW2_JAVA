package karan;

import java.util.ArrayList;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(1.11);
		al.add(1.22);
		al.add(2.11);
		al.add(3.22);
		al.add(4.11);
		double sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum=sum+al.get(i);
		}
		System.out.println(sum);
	}

}
