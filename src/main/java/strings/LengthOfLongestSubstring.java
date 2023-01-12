package strings;
/*
  @created 17/10/22
  @author  manish.mandora

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

*/

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring ofLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(ofLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }


    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> look = new HashSet<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (look.add(ch)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != ch) {
                    look.remove(s.charAt(left));
                    left++;
                }
               look.remove(ch);
                left++;
            }
        }
        return max;
    }


}
