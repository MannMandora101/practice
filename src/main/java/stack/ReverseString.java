package stack;

import java.util.Stack;

class ReverseString {
    public String reverse(String s) {
        if (s == null || s == "") {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        int j = 0;
        while (!stack.isEmpty()) {
            chars[j] = stack.pop();
            j++;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("manish"));
    }

}