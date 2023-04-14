package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*WAP to create an ArrayList of string values. Add six strings to it. Iterate through it using iterator, for each loop and for loop. Display the 
 * values. Find index of the first occurrence of an element in the Arraylist and find index of the last element in the array list.
 */

public class Q2 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  al.add("Orange");
		  al.add("Cherry");
		
		  System.out.println("Traversing list through List Iterator:");
		  
		  ListIterator<String> al2=al.listIterator(al.size());  
          while(al2.hasPrevious())  
          {  
              String str=al2.previous();  
              System.out.println(str);  
          }  
          System.out.println("Traversing list through for loop:");  
          for(int i=0;i<al.size();i++)  
          {  
           System.out.println(al.get(i));     
          }  
             
       System.out.println("Traversing list through forEach() method:"); 
       al.forEach(a->{  
           System.out.println(a);  
         });  
           
       

	}

}
