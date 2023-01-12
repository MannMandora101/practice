package arrays.twoPointer;
/*
  @created 13/11/22
  @author  manish.mandora


Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

*/

public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();
            if (rev.equals(words[i])) {
             return words[i];
            }
        }

        return "";
    }

    public static void main(String[] args) {
        FirstPalindrome firstPalindrome=new FirstPalindrome();
        System.out.println(firstPalindrome.firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

}
