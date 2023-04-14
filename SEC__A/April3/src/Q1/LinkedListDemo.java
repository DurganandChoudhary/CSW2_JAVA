package Q1;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * LinkedList Class belongs to Collection Framework which implemens
 * List Interface as well as Deque interface
 * LinkedList Class uses Double LinkedList data structure internally
 * It allows duplicative Values
 * It is not Synchronized.
 * It is an ordered  collection
 * Insertion ordered collection
 * Insertion and DELETION ARE ARE FASTER IN COMPARISION TO aRRAYlIST.
 * Accessing elements is slower in comparision to ArrayList.
 * LinkedList class can be used as List, Stack and Queue.
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> a1 = new LinkedList<>();
		a1.add("cse");
		a1.add("csit");
		a1.add("eee");
		a1.add("ece");
		a1.add("Mechanical");
		a1.add("cse");
		a1.add("null");
		a1.addLast(null);
		
		System.out.println(a1);
		
		a1.removeFirst();
		a1.removeLast();
		a1.remove(2);

		ListIterator<String> it = a1.listIterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		ListIterator<String> it1 = a1.listIterator();
		while(it1.hasPrevious()) {
			String s1 = it1.previous();
			System.out.println(s1);
		}

		
		
		


	}

}
