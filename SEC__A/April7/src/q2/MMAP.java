package q2;
/*
 * TreeMap, HashMap and LinkedHashMap implements Set interface.
 * They store in key, value pairs.
 *  ******** TreeMap***********
 *  TreeMap does not allow Null value but allow multiple null values.
 *  Time Complexity is O(log n)
 *  Output comes in sorted order of keys.
 *  
 *  *********HashMap************
 *  
 *  HashMap allows one null value and multiple null values.
 *  Time Complexity is O(1)
 *  output comes in Random order.
 *  
 *  ***********LinkedHashMap***************
 *  LinkedHashMap allows one null key and multiple null values.
 *  Time complexity is O(1)
 *  Output comes in order of insertion.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MMAP {

	public static void main(String[] args) {
		
		HashMap<String , Integer> hm = new HashMap<>();
		
		hm.put(" gsgch", 4);
		hm.put("xcvx ", 1);
		hm.put(" cvcx",77 );
		hm.put(" v", 6);
		hm.put("dvvd ",4 );
		hm.put(" dv",5 );
		
		
		System.out.println(hm);
		
		LinkedHashMap<Integer,String> hm1=new LinkedHashMap<Integer,String>();  
		  
		  hm.put("Amit",100);  
		  hm.put("Vijay",101);  
		  hm.put("Rahul",102);  
		  
		for(Map.Entry m:hm1.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
