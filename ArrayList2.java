package Q1;

import java.util.ArrayList;
import java.util.Collections;

/*WAP to create an ArrayList of type integer. AQdd few elements into it. Display the elements of the ArrayList in reverse order. 
Find the maximum and minimum value in the java arrayList. Swap 2nd and 6th index values of the ArrayList and display the contents after swapping. 
*/
public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(7);
		a1.add(9);
		a1.add(3);
		a1.add(1);
		a1.add(0);
		a1.add(14);
		a1.add(70);
		a1.add(80);
		a1.add(44);
		a1.add(29);
		a1.add(8);
		a1.add(5);
		a1.add(77);
		
		Collections.sort(a1);
		System.out.println("Sorted ArrayList : "+a1);
		
		Object minValue = Collections.min(a1);
        Object maxValue = Collections.max(a1);
        System.out.println("Minimum value is = " + minValue);
        System.out.println("Maximum value is = " + maxValue);
		
		System.out.println("Before Reversing");  
        System.out.println(a1.toString());
        
        Collections.reverse(a1);  
        System.out.println("After Reversing");  
        System.out.println(a1); 
		
        
        System.out.println("Original List : " +a1);  
        
        Collections.swap(a1, 2, 6);  
        System.out.println("List after swapping : " +a1); 
		
		
		
		

	}

}
