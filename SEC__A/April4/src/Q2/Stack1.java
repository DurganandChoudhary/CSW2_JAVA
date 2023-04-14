package Q2;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> stack=new Stack <String>();
		stack.add("Vijay");
		stack.push("Rahul");
		stack.push("Aman");
		stack.push("Mohit");
		
		
	System.out.println("stack " +stack);
	System.out.println("Stack size: "+stack.size());
	System.out.println("Stack pop "+stack.pop());	
	System.out.println("Stack peek "+stack.peek());
	System.out.println("Stack isempty "+stack.isEmpty());
		
	}

}
