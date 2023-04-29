package com.hs.onefifty.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (token.equals("+")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(a + b);
			} else if (token.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b - a);
			} else if (token.equals("*")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(a * b);
			} else if (token.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b / a);
			} else {
				stack.add(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
