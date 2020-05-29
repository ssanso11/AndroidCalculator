package com.example.calculator;

// class to evaluate value of a postfix
// expression having multiple digit operands
import java.util.Stack;

public class PostFixEvaluator {
    // Method to evaluate value of a postfix expression
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String expression)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();

        // Scan all characters one by one
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);

            // If the scanned character is a number, push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');

            //  If the scanned character is an operator, pop two elements from stack and apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                //switch case to check what operator
                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        //at the end, stack should only be length one containing the result
        return stack.pop();
    }

}
