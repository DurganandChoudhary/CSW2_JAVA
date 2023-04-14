package karan;

import java.util.LinkedList;

public class p21 {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("a");
		obj.add("b");
		obj.addFirst("c");
		obj.addLast("d");
		obj.add(1,"e");
		obj.add("f");
		obj.add("g");
		System.out.println("Linked list is: " + obj);
		obj.removeFirst();
		obj.removeLast();
		obj.remove(3);

		
		boolean stat = obj.contains("e");
		 if (stat) {
			 System.out.println("List contains the element e ");
			 }else {
			 System.out.println("List doesn’t contain the element e");
			 }
		 obj.set(3, "y");
		 System.out.println("Linked list is: " + obj);
		 
	}

}
