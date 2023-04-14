import java.util.ArrayList;
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
		int n=5;
		ArrayList <Integer>a1 = new ArrayList<Integer>(n);
		System.out.println("THE LIST IS: "+ a1);
		for(int i=0;i<=n;i++) {
			a1.add(i);
		}
		System.out.println("ARRAY IS "+a1);
			  System.out.println(" enter an element: ");
			  Scanner sc=new Scanner(System.in);
			 int p=sc.nextInt();
			
				  if(a1.contains(p)) {
					  System.out.println("element present");
				  }
				  else {
					  System.out.println("element not found");
				  }
				  
				  System.out.println("enter position to remove the element: ");
				  int a=sc.nextInt();
				  a1.remove(a);
				  System.out.println("NEW LIST IS: "+ a1);
			  
                boolean k=a1.isEmpty();
                System.out.println("LIST IS EMPTY "+k);
         }
   }

