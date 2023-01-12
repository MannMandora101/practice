package stack;
/*
  @created 03/09/22
  @author  manish.mandora
*/

import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String exp = "2319*-9+";
        System.out.println("postfix evaluation: " + evaluatePostfix(exp));
    }

    private static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                Integer val1 = stack.pop();
                Integer val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                    default:
                        System.out.println("no operator found");
                }
            }

        }
        return stack.pop();
    }

}
