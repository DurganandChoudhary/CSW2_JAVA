package karan;

import java.util.HashMap;

public class p24 {

	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("Mason", new Integer(55));
		hm.put("Jacob", new Integer(77));
		hm.put("William", new Integer(99));
		hm.put("Emma", new Integer(65));
		hm.put("Karan", new Integer(77));
		
		//the name is the key
		//value is the number
		System.out.println("Students count ::"+hm.size());
		for(String key:hm.keySet())
		{
			System.out.println(key+"score marks:"+hm.get(key));
		}
		System.out.println(hm.containsKey("Emma"));
		System.out.println(hm.containsKey("John"));
	
	}

}
