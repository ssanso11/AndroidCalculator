package com.example.calculator;

import java.util.Stack;
//we didn't implement this class but it's the class we wrote out to deal with infix to postfix notation
public class ConvertPostfix {
    //check operator priority, +- have 1, */ have 2, ^ has 3
    private static int operatorPriority(char op) {
        if (op == '*' || op == '/') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        } else if (op == '^') {
            return 3;
        } else {
            return -1;
        }
    }
    //main method, param is the expression you want ot convert to postfix
    static String convertToPostfix(String expression) {
        //result
        String result = "";
        //a stack holding operator characters
        Stack<Character> stack = new Stack<>();
        //iterate through the expression
        for (int i = 0; i < expression.length(); i++) {
            //take the current character
            Character c = expression.charAt(i);
            //if its a number, we just add it to the result string
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            //if it's a ( we push the character to the stack
            else if (c == '(') {
                stack.push(c);
            }
            //if its a ) we add all the items currently in the stack to the result string until we find the ), then we discard them
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Syntax error";
                } else {
                    stack.pop();
                }
            }
            //if its an operator we have to compare the precedence of the current operator with the one at the top of the stack
            //if the precedence of the current operator is greater than the one in the stack, we push it to the stack,
            //if its not, then we add to the result string all of the operators with a precedence greater than the current operator,
            //and the we pushthe current operator to the stack
            else {
                // we have ex a + an a ** in stack, we want to pop **
                // off the stack and add to result, then
                while (!stack.isEmpty() && operatorPriority(stack.peek()) >= operatorPriority(c)) {
                    if (stack.peek() == '(') {
                        return "Syntax error";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }

        }
        //take all of the elements out of the stack, if a ( hasn't been discarded, there's a syntax error in the expression
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Syntax error";
            result += stack.pop();
        }
        //return the postfix result
        return result;
    }
}