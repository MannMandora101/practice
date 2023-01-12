package stack;/* 
  @created 04/09/22
  @author  manish.mandora
*/

import java.util.Stack;

public class LengthOfTheLongestValidSubstring {
    public static void main(String[] args) {
        String str = "((()()";
        System.out.println(findMaxLen(str));
        str = "()(()))))";
        System.out.println(findMaxLen(str));
    }

    private static int findMaxLen(String str) {
        Stack<Integer> stack = new Stack<>();
        int length = str.length();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.empty()) {
                    stack.pop();
                }
                if (!stack.empty()) {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }

}
