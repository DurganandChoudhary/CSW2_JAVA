import java.util.Stack;

public class Parenthesis {
    public static void printParenthesisNumber(String expn, int size) {
        char ch;
        Stack<Integer> stk = new Stack<Integer>();
        String output = new String();
        int count = 1;
        for (int i = 0; i < size; i++) {
            ch = expn.charAt(i);
            if (ch == '(') {
                stk.push(count);
                output += count;
                count += 1;
            } else if (ch == ')')
                output += stk.pop();
        }
        System.out.println("Parenthesis Count ");
        System.out.println(output);
    }

    public static void main(String[] args) {
        String expn1 = "(((a+(b))+(c+d)))";
        int size = expn1.length();
        System.out.println("Given expn " + expn1);
        printParenthesisNumber(expn1, size);
    }
}