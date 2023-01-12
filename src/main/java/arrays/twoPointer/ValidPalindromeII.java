package arrays.twoPointer;
/*
  @created 14/11/22
  @author  manish.mandora


  Example 1:

Input: s = "aba"
Output: true

Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

*/

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start, end - 1) || isPalindrome(s, start + 1, end);
            }
            start++;
            end--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int start, int end) {
        char[] chars = s.toCharArray();
        while (start <= end) {
            if (chars[start] != chars[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ValidPalindromeII validPalindromeII=new ValidPalindromeII();
        System.out.println(validPalindromeII.validPalindrome("abca"));
    }
}
