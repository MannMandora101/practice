package arrays;/* 
  @created 01/10/22
  @author  manish.mandora
*/

import java.util.Stack;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<Character>();
        int length = num.length();
        if (k >= length) {
            return "0";
        }
        for (int i = 0; i < length; i++) {
            if (stack.empty()) {
                stack.push(num.charAt(i));
            } else {
                while (!stack.empty() && stack.peek() > num.charAt(i) && k > 0) {
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
            }
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        if (stack.empty()) {
            return "0";
        }

        char result[] = new char[stack.size()];
        int len = result.length - 1;
        while (len >= 0) {
            result[len--] = stack.pop();
        }

        int i = 0;
        while (i< result.length && result[i] == '0') {
            i++;
        }

        StringBuilder ans = new StringBuilder();
        while (i < result.length) {
            ans.append(result[i++]);
        }
        if (ans.length() == 0) {
            ans.append("0");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        RemoveKdigits removeKdigits = new RemoveKdigits();
        System.out.println(removeKdigits.removeKdigits("1432219", 3));
    }
}
