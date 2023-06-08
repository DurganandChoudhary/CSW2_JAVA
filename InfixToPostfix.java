

import java.util.Stack;

public class InfixToPostfix {
    // Method to check if a given character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Method to get the precedence of an operator
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
            default:
                return -1;
        }
    }

    // Method to convert infix expression to postfix expression
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char currentChar = infixExpression.charAt(i);

            // If the current character is an operand, add it to the postfix expression
            if (Character.isLetterOrDigit(currentChar)) {
                postfixExpression.append(currentChar);
            }
            // If the current character is an opening parenthesis, push it to the stack
            else if (currentChar == '(') {
                operatorStack.push(currentChar);
            }
            // If the current character is a closing parenthesis, pop operators from the stack
            // and add them to the postfix expression until an opening parenthesis is encountered
            else if (currentChar == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    throw new IllegalArgumentException("Invalid infix expression");
                } else {
                    operatorStack.pop(); // Remove the opening parenthesis
                }
            }
            // If the current character is an operator, pop operators from the stack
            // and add them to the postfix expression if they have higher precedence
            // or equal precedence with the current operator
            else if (isOperator(currentChar)) {
                while (!operatorStack.isEmpty() && getPrecedence(currentChar) <= getPrecedence(operatorStack.peek())) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(currentChar);
            }
        }

        // Pop any remaining operators from the stack and add them to the postfix expression
        while (!operatorStack.isEmpty()) {
            if (operatorStack.peek() == '(') {
                throw new IllegalArgumentException("Invalid infix expression");
            }
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
