package arrays.twoPointer;/* 
  @created 15/11/22
  @author  manish.mandora


  Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
        }
        return builder.toString();
    }

    public String mergeAlternately_(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int s1 = 0;
        int s2 = 0;
        while (s1 < word1.length() && s2 < word2.length()) {
            builder.append(word1.charAt(s1));
            builder.append(word2.charAt(s2));
            s1++;
            s2++;
        }
        builder.append(word1.substring(s1));
        builder.append(word2.substring(s2));
        return builder.toString();
    }

    public static void main(String[] args) {
        MergeAlternately alternately = new MergeAlternately();
        System.out.println(alternately.mergeAlternately_("ab", "pqr"));
        System.out.println(1%2);
    }
}
