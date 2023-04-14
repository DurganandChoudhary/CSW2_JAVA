package Q3;

import java.util.ArrayDeque;
import java.util.Deque;
 
public class ArrayDeque1 {
 
    public static void main(String[] args)
    {
 
        Deque<Integer> stack = new ArrayDeque<Integer>();
 
        stack.push(17);
        stack.push(19);
        stack.push(15);
 
        System.out.println("Stack after insertion: "+ stack);
 
        stack.pop();
        System.out.println("Stack after deletion: "+ stack);
 
        stack.pop();
        System.out.println("Stack after deletion: "+ stack);
    }
}