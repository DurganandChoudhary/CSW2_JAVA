package S_LinkedList;
import java.util.Scanner;
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LinkedList L1=new LinkedList();
		L1.create();
		while(true)
		{
			System.out.println("********Menu********");
			System.out.println("0.Exit");
			System.out.println("1.Display");
			System.out.println("2.Count");
			
			System.out.println("Enter your chice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 0: return;
			case 1: L1.display();
					break;
			case 2: System.out.println("Number of nodes + "+L1.count());
			 		break;
			default: System.out.println("Invalid choice");
			}
			
			}
	
		//L1.display();
		//System.out.println("Number of nodes = "+L1.count());
	}

}
