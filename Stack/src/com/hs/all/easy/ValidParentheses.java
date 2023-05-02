package com.hs.all.easy;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char charValue : s.toCharArray()) {
			if (charValue == '[' || charValue == '(' || charValue == '{') {
				stack.push(charValue);
			} else if (charValue == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != '[') {
					return false;
				}
			} else if (charValue == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != '(') {
					return false;
				}
			} else if (charValue == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ValidParentheses ch = new ValidParentheses();
		String exp = "[]";
		boolean b = ch.isValid(exp);
		System.out.println(b);
	}
}