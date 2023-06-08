

import java.util.Stack;

public class InfixToPrefixConverter {
    
    // Function to check if a character is an operand
    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }
    
    // Function to get the precedence of an operator
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
                
            case '^':
                return 3;
        }
        return -1;
    }
    
    // Function to convert infix expression to prefix expression
    public static String convertToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        // Reverse the infix expression
        StringBuilder reversedInfix = new StringBuilder(infix).reverse();
        
        for (int i = 0; i < reversedInfix.length(); i++) {
            char currentChar = reversedInfix.charAt(i);
            
            // If the current character is an operand, append it to the prefix expression
            if (isOperand(currentChar)) {
                prefix.append(currentChar);
            }
            
            // If the current character is an opening parenthesis, push it to the stack
            else if (currentChar == ')') {
                stack.push(currentChar);
            }
            
            // If the current character is an operator
            else if (!isOperand(currentChar)) {
                // Pop operators from the stack and append them to the prefix expression until an opening parenthesis or an operator with lower precedence is encountered
                while (!stack.isEmpty() && stack.peek() != ')' && getPrecedence(currentChar) < getPrecedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(currentChar);
            }
            
            // If the current character is a closing parenthesis, pop operators from the stack and append them to the prefix expression until an opening parenthesis is encountered
            else if (currentChar == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == ')') {
                    stack.pop();
                }
            }
        }
        
        // Pop any remaining operators from the stack and append them to the prefix expression
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }
        
        // Reverse the prefix expression to get the final result
        return prefix.reverse().toString();
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        String infixExpression = "(A+B)*(C-D)";
        String prefixExpression = convertToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
