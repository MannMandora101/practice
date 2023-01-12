package arrays.twoPointer;
/*
  @created 14/11/22
  @author  manish.mandora

  Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
*/

public class ReversePrefix {

    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                reverse(chars, i);
                break;
            }
        }
        return new String(chars);
    }

    private void reverse(char[] chars, int end) {
        int start = 0;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        ReversePrefix prefix=new ReversePrefix();
        System.out.println(prefix.reversePrefix("abcdefd",'d'));
    }
}
