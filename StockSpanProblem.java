import java.util.*;

public class StockSpanProblem {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // The span of the first day is always 1
        span[0] = 1;
        stack.push(0);
        
        for (int i = 1; i < n; i++) {
            // Pop elements from the stack as long as the price at the current day is greater than the price on the top of the stack
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()])
                stack.pop();
            
            // Calculate the span for the current day
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            
            // Push the current day onto the stack
            stack.push(i);
        }
        
        return span;
    }
    
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);
        
        System.out.println("Stock span:");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
