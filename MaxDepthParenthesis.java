import java.util.Stack;

public class MaxDepthParenthesis {
    public static int maxDepthParenthesis(String expn, int size) {
        Stack<Character> stk = new Stack<Character>();
        int maxDepth = 0;
        int depth = 0;
        char ch;
        for (int i = 0; i < size; i++) {
            ch = expn.charAt(i);
            if (ch == '(') {
                stk.push(ch);
                depth += 1;
            } else if (ch == ')') {
                stk.pop();
                depth -= 1;
            }
            if (depth > maxDepth)
                maxDepth = depth;
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        String expn = "((((A)))((((BBB()))))()()()())";
        int size = expn.length();
        int value = maxDepthParenthesis(expn, size);
        System.out.println("Max depth parenthesis is " + value);
    }
}