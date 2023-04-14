package karan;
import java.util.*;
public class P17 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.set(3,"karan");
		System.out.println(al.get(4));
		System.out.println(al.contains(5));
		System.out.println("content of the array :"+al);
		System.out.println("array size "+al.size());
		System.out.println("array isEmpty"+al.isEmpty());
		al.remove(al.size()-1);
		al.removeAll(al);
		System.out.println("content of the array :"+al);
	}

}
