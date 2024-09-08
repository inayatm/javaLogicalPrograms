package org.example;

import java.util.Stack;

/**
 * Check if a string has balanced parentheses. This includes (), {}, and [].
 * Explanation:
 * Stack is used to keep track of the last unmatched opening bracket.
 * When we encounter a closing bracket, we check whether it matches the last opening bracket from the stack.
 * If at any point it doesn't match or the stack is empty when encountering a closing bracket, the parentheses are not balanced.
 * If the stack is empty after processing the string, the parentheses are balanced.
 */

public class CheckBalancedParanthesisInAString {

    public static void main(String[] args) {
        String paranthesis = "({[]})";
        System.out.println(paranthesis + " has matching/balanced paranthesis: " + hasBalacedParanthesis(paranthesis));

    }

    public static boolean hasBalacedParanthesis(String paranthesis) {
            //string should not be empty or null
        if (!paranthesis.isBlank()) {
            //Use a stack to keep track of opening parentheses.At the end, the stack should be empty if the parentheses are balanced.
            Stack<Character> stackofChars = new Stack<>();

            for (Character ch : paranthesis.toCharArray()) {

                if (ch == '(' || ch == '{' || ch == '[') {
                    stackofChars.push(ch);
                } else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stackofChars.isEmpty()) {
                        return false;
                    }

                    char top = stackofChars.pop();
                    if (!hasMatchingpair(top, ch))
                        return false;
                }

            }
            return true;
        }
        return  false;
    }

    private static boolean hasMatchingpair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

}
