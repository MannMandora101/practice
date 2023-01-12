package arrays.twoPointer;
/*
  @created 13/11/22
  @author  manish.mandora
*/

public class ReverseVowels {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while (start < end) {
            while (start < s.length() && !isVowel(chars[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(chars[end])) {
                end--;
            }
            if (start < end) {
                reverse(chars, start++, end--);
            }
        }
       return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }

    private boolean isVowel(char aChar) {
        return aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u' ||
                aChar == 'A' || aChar == 'E' || aChar == 'I' || aChar == 'O' || aChar == 'U';
    }

    public static void main(String[] args) {
        ReverseVowels reverseVowel=new ReverseVowels();
        System.out.println(reverseVowel.reverseVowels("leetCode"));
    }
}
