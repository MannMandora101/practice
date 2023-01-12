package arrays.twoPointer;

/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

*/

import java.util.Locale;

class IsPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        System.out.println(str);
        int start = 0;
        int end = str.length() - 1;
        String rev = new StringBuilder(str).reverse().toString();
        if (rev.equals(str)) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome_(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int start = 0;
        int end = str.length() - 1;
        boolean isPallindrom = false;
        char[] chars = str.toCharArray();
        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
                isPallindrom = true;
            }
        }

        if (isPallindrom) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        System.out.println(palindrome.isPalindrome_("A man, a plan, a canal: Panama"));
    }


    public boolean isPalindrome_1(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int start = 0;
        int end = str.length() - 1;
        char[] chars = str.toCharArray();
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
}