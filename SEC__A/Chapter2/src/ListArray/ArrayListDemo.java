package ListArray;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList Class Implements List Interface.
//ArrayList Class is representation of dynamic array.It does not have any fixed size.

//Its size increases when when we add elements into it and its size decreases when we remove elements from it.
//It uses array data structure internally.Hence it allows a fetch its implements through index.
//It is an ordered collection. Hence it maintains the insertion order OF THE ELEMENTS.
//You cannot create an ArrayList of Primitive data types.
// ArrayList is not synchronized.

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("CSE");
		a1.add("CSIT");
		a1.add("EEE");
		a1.add("ECE");
		a1.add("Mechanical");
		a1.add("CSE");
		
		Iterator<String> i = a1.iterator();
		while(i.hasNext()) {
			String s=i.next();
			System.out.println(s);
		}
	/*	for(String s:a1) {
			System.out.println(s);
		}
		for(int j=0;j<a1.size();j++) {
			System.out.println(a1.get(j));
		}
		
		*/

	}

}
