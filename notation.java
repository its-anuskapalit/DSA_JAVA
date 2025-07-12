/*
Infix → Postfix
Infix → Prefix
Postfix → Infix
Prefix → Infix
Postfix → Prefix
Prefix → Postfix*/

import java.util.Stack;

class ExpressionConverter {

    // Priority for operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // 1. Infix to Postfix
    static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // remove '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // 2. Infix to Prefix
    static String infixToPrefix(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        // Swap brackets
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        String reversedInfix = sb.toString();
        String postfix = infixToPostfix(reversedInfix);
        String prefix = new StringBuilder(postfix).reverse().toString();

        return prefix;
    }

    // 3. Postfix to Infix
    static String postfixToInfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String expr = "(" + op1 + c + op2 + ")";
                stack.push(expr);
            }
        }

        return stack.peek();
    }

    // 4. Prefix to Infix
    static String prefixToInfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr = "(" + op1 + c + op2 + ")";
                stack.push(expr);
            }
        }

        return stack.peek();
    }

    // 5. Postfix to Prefix
    static String postfixToPrefix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String expr = c + op1 + op2;
                stack.push(expr);
            }
        }

        return stack.peek();
    }

    // 6. Prefix to Postfix
    static String prefixToPostfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr = op1 + op2 + c;
                stack.push(expr);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Infix:           " + infix);

        String postfix = infixToPostfix(infix);
        System.out.println("Postfix:         " + postfix);

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix:          " + prefix);

        System.out.println("Postfix → Infix: " + postfixToInfix(postfix));
        System.out.println("Prefix  → Infix: " + prefixToInfix(prefix));
        System.out.println("Postfix → Prefix:" + postfixToPrefix(postfix));
        System.out.println("Prefix  → Postfix:" + prefixToPostfix(prefix));
    }
}
