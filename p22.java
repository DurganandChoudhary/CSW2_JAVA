package karan;
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack <Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("stack" +stack);
		System.out.println("Stack size:"+stack.size());
	System.out.println("Stack pop"+stack.pop());	
	System.out.println("Stack peek"+stack.peek());
	System.out.println("Stack isempty"+stack.isEmpty());
		
	}

}
