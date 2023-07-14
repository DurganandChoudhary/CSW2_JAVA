package SingleLinkedList;

import java.util.Scanner;
public class LinkedListCreation {
	static Node head;
	public static void create(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of nodes");
		int n = sc.nextInt();
		while(n!=0) {
			Node p = new Node();
			System.out.println("Input Node Value");
			p.regd_no= sc.nextInt();
			p.Mark = sc.nextInt();
			
			p.next = start;
			start = p ;
			n = n-1;
		}
		head = start;
	}
	
	
	static void display()
	{
		Node temp = head;
		while (temp!=null) 
		{
		System.out.println("Registration no. is "+temp.regd_no);
		System.out.println("Mark is "+temp.Mark);
		temp = temp.next;
	}
		}
	
	
	static Node insbeg(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter the node you want in beggining");
		p.regd_no=sc.nextInt();
		p.Mark = sc.nextInt();
		p.next=start;
		head = p;
		
		return start;
		
	}
	
	
	static Node insend(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node you want to insert in End");
		Node p = new Node();
		p.regd_no = sc.nextInt();
		p.Mark = sc.nextInt();
		Node temp =start;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = p;
		
		
	return start;
	}
	public static Node InsAny(Node start) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the Position ");
		int n = sc.nextInt();
		Node p = new Node();
		System.out.println("Input Node Value ");
		p.regd_no = sc.nextInt();
		p.Mark = sc.nextInt();
		int count = 0;
		if(n==0) {
			p.next=start;
			head = p;	
			return start;
		}
		Node temp = start;
		while(count!=n-1) {
			temp = temp.next;
			count++;
		}
		p.next = temp.next;
		temp.next = p;
		
		return start;
	}

	
	
	public static int count(Node start) {
		Node temp = start;
		int co = 0;
		while(temp!=null) {
			co++;
			temp = temp.next;
			
		}
		System.out.println(co);
		return co;
	}
	
	
	 public static Node DelBeg(Node start) {
		 if (start==null) {
			 return null;
		 }
		 head = start.next;
		 
		 return start;
	 }
	 
	 
	 public static Node DelEnd(Node start) {
		 if (start== null) {
			 return start;
		 }
		 Node temp = start;
		 while(temp.next.next!=null) {
			 temp = temp.next;
		 }
		 temp.next = null;
		 return start;
	 }
	 public static Node DelAny(Node start) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input Delete Position: ");
		 int pos = sc.nextInt();
		 if (start==null) {
			 return null;
		 }
		 if(pos==1) {
			 head = start.next;
			 return start;
		 }
		 int count = 1;
		 Node temp = head;
		 while(count!=pos-1) {
			 temp = temp.next;
			 count++;
		 }
		 Node temp1=temp.next.next;
		 temp.next = temp1;
		 return start;
	 }
	 
	 
	 public static void search(Node start) {
		 Scanner sc = new Scanner(System.in);
		 Node p = new Node();
		 System.out.println("Enter  registration no:");
		 int r = sc.nextInt();
		 System.out.println("Enter  mark");
		 int m=sc.nextInt();
		 Node temp =start;
		 boolean result = false;
		 while(temp!=null) {
			 if(temp.regd_no==r&&temp.Mark==m) {
				 result = true;
				 break;
			 }
			 temp = temp.next;
		 }
		 if (result==true) {
			 System.out.println("registration no. and mark is available");
		 }
		 else {
			 System.out.println("not available");
		 }
	 }
	 
	 public static void sort(Node start) {
		 Node temp = head;
		 Node temp2;
		 while(temp.next!=null) {
			 temp2 = temp;
			 while(temp2!=null) {
				 if(temp.regd_no >temp2.regd_no) {
					 int temp3= temp.regd_no;
					 temp.regd_no = temp2.regd_no;
					 temp2.regd_no = temp3;
					 
					float temp4 = temp.Mark;
					temp.Mark = temp2.Mark;
					temp2.Mark = temp4;
				 }
				 temp2 = temp2.next;
			 }
			 temp = temp.next;
		 }
	 }
	 public static Node reverse(Node start) {
		 Node prev = null;
		 Node current = start;
		 Node next = null;
		 while(current!=null) {
			 next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
		 }
		 head = start;
		 return start;
	 }


	 
	public static void main(String[] args) {
		create(head);
		while(true)
		{
		 System.out.println("****MENU*****");
		 System.out.println("1:Insert at first");
		 System.out.println("2:Insert at End");
		 System.out.println("3:Delete at first");
		 System.out.println("4:Delete at end");
		 System.out.println("5:count the no. of nodes");
		 System.out.println("6:earch a particular node.");
		 System.out.println("7:Display");
		 System.out.println("8:insert at any position.");
		 System.out.println("9:delete at any position.");
		 System.out.println("10:sort regd no wise.");
		 System.out.println("11:reverse the node.");
		 
		 System.out.println("Enter the choice");
		 Scanner sc = new Scanner(System.in);
		 int choice=sc.nextInt();
		 switch(choice)
		 {
		
		 case 1:
	     insbeg(head);
		 break;
		 case 2:
		insend(head);
		break;
		 case 3 :
			DelBeg(head); 
		 break;
		 case 4 : DelEnd(head);
		 break;
		 case 5 : count(head);
		 break;
		 case 6 : search(head);
		 break;
		 case 7 : display();
		 break;
		 case 8 : InsAny(head);
		 break;
		 case 9 : head = DelAny(head);
		 break;
		 case 10 :sort(head);
		 break;
		 case 11 :reverse(head);
		 break;
		 
		 default:
		 System.out.println("Wrong choice");
		 
		 }
		 }
		}
   
	}

