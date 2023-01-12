package common;/* 
  @created 12/10/22
  @author  manish.mandora


Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        if (rev == x) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(12));
        int c=100;
        int d=100;
        System.out.println(c==d);
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == d);

    }

}
