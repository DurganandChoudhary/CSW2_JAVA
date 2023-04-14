package karan;
import java.util.*;
import java.util.HashSet;

public class p23 {

	public static void main(String[] args) {
		TreeSet<String> A=new TreeSet<String>();
		//preserves the insertion order
		A.add("one");
		A.add("two");
		A.add("three");
		A.add("four");
		A.add("three");
		A.add("five");
		Iterator<String> i= A.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
