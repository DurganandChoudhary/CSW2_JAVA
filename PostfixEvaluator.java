package Q2A;

import java.util.Stack;

public class PostfixEvaluator {

	public static void main(String[] args) {
		String postfix = "5 6 2 + * 12 4 / -"; 
		double result = evaluatePostfix(postfix);
		System.out.println("Result: " + result);
	}

	public static double evaluatePostfix(String postfix) {
		Stack<Double> stack = new Stack<>();
		String[] tokens = postfix.split(" ");

		for (String token : tokens) {
			if (isNumber(token)) {
				stack.push(Double.parseDouble(token));
			} else {
				double operand2 = stack.pop();
				double operand1 = stack.pop();
				double result = performOperation(token.charAt(0), operand1, operand2);
				stack.push(result);
			}
		}

		return stack.pop();
	}

	private static boolean isNumber(String token) {
		try {
			Double.parseDouble(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static double performOperation(char operator, double operand1, double operand2) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}
}