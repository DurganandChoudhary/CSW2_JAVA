package apl7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * HashSet, TreeSet classes implement the Set interface.

*They do not allow duplicate values.

*Both are not thread safe.

*They are not synchronized.

*Uses hash table data structure.

*TimE complexity for different operations is 0(1) null values are allowed.

*faster than TreeSet

*order of output is random.

*******TreeSet******

*Uses self balancing RBT.

*time complexity for different operations is: 0(log n)

*null values are not allowed.

*slower than HashSet

*order of output in sorted.
*
*********LinkedHashset********
*
*Uses Hash table with Linked List.
*More Expensive than hashSet.
*Null Values are allowed.
*Order of Output is same as insertion Order.
 */
public class HSM {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("ABC");
		hs.add("DEFG ");
		hs.add("HI ");
		hs.add("J ");
		hs.add("VK ");
		hs.add(" ABC");
		
		System.out.println(hs);
		
		LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Five");   
        set.add("Four");  
        set.add("Five");  
        
        System.out.println(set);
        
        TreeSet<String> ts = new TreeSet<>();
        
        ts.add("Chennai ");
        ts.add(" Delhi");
        ts.add("Kolkata ");
        ts.add(" BBSR");
        ts.add("Patna ");
        ts.add(" Mumbai");
        
        System.out.println(ts);

		
		
		
	}

}
