package karan;

import java.util.LinkedList;
public class p20 {
 public static void main(String[] args) {
 LinkedList<String> obj = new LinkedList<String>();
 // Adding elements in various orders and positions
 obj.add("a");
 obj.add("b");
 obj.addLast("c");
 obj.addFirst("d");
 obj.add(2, "e");
 obj.add("f");
 obj.add("g");
 System.out.println("Linked list is: " + obj);
 // Now removing elements from the linked list using different options
 obj.remove("b");
 obj.remove(3);
 obj.removeFirst();
 obj.removeLast();
 System.out.println("New linked list after removing: " + obj);
 // Finding elements in the linked list
 boolean stat = obj.contains("e");
 if (stat) {
 System.out.println("List contains the element ‘e’ ");
 }else {
 System.out.println("List doesn’t contain the element ‘e’");
 }
 // Other linked list information
 int size = obj.size();
 System.out.println("Size of linked list = " + size);
 }
} 