package Q1;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentDemo {
	
	String name;
	int rollNo;
	double mark;
	
	public StudentDemo(String a, int b, double c)
	{
		name=a;
		rollNo=b;
		mark = c;
	}
	
	public static void main(String[] args)
	{
		
		LinkedList<StudentDemo> ll = new LinkedList<>();
		
		ll.add(new StudentDemo("Raju ", 23, 90));
		ll.add(new StudentDemo(" Vijay", 20, 95));
		ll.add(new StudentDemo("Mohit ", 27, 99));
		ll.add(new StudentDemo(" Shivam", 28, 80));
		ll.add(new StudentDemo("Rahul ", 29, 97));
		
		for(StudentDemo s : ll)
		{
			System.out.println("Name : " +s.name +" Roll no : " +s.rollNo +"Mark :" +s.mark);
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name to Search ");
		String a = sc.next();
		boolean flag = false;
		for(StudentDemo s1 : ll)
		{
			String b=s1.name;
			if(a.equals(b))
				flag = true;
		}
		if(flag)
			System.out.println("This is Present in the list");

		else
			System.out.println("This is not Present in the list");
		
		ll.removeFirst();
		for(StudentDemo s : ll)
		{
			System.out.println("Name : " +s.name +" Roll no : " +s.rollNo +"Mark :" +s.mark);
			
		}
				System.out.println("The number of object in the list are :"+ll.size());
	}

}
