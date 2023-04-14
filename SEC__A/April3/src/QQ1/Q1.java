package QQ1;
import java.util.ArrayList;
// ASSIGNMENT 2 QUESTION
/*
 * Write a program to create an ArrayList of Integer Type
 */
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<>();
		
                a1.add(4);
                a1.add(9);
                a1.add(6);
                a1.add(5);
                a1.add(7); 
                a1.add(2);
		
		
		System.out.println(a1);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean ans=a1.contains(n);
		
		if(ans)
			System.out.println("The List Contains "+n);  
		else
			System.out.println("The List does not Contains "+n);
		
		System.out.println("Enter a Position");
		int p = sc.nextInt();
		a1.remove(a1);
		System.out.println(a1);
		
		if(a1.isEmpty()) {
			System.out.println("List is Empty");
		}
		else
			System.out.println("List is not Empty");
								

	}

}
