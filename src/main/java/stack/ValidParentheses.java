package stack;/* 
  @created 03/10/22
  @author  manish.mandora


 Input: s = "()[]{}"
Output: true
*/

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char charc : chars) {
            if (charc == '(' || charc == '{' || charc == '[') {
                stack.push(charc);
            } else {
                if(!stack.empty()){
                    if (charc == ')' && stack.peek() != '(') {
                        return false;
                    }
                    if (charc == '}' && stack.peek() != '{') {
                        return false;
                    }
                    if (charc == ']' && stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(")(){}"));
    }
}
