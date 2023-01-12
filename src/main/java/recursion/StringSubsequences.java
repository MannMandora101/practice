package recursion;
/*
  @created 27/05/22
  @author  manish.mandora
*/

import java.util.HashSet;

public class StringSubsequences {
    public static void main(String[] args) {
        subsequences("abc", 0, "");
        uniqueSubsequences1("aaa", 0, "", new HashSet<>());
    }

    public static void subsequences(String givenString, int index, String newString) {
        if (index == givenString.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = givenString.charAt(index);
        //to be
        subsequences(givenString, index + 1, newString + currChar);
        //not to be
        subsequences(givenString, index + 1, newString);
    }


    public static void uniqueSubsequences1(String givenString, int index, String newString, HashSet<String> hashSet) {
        if (index == givenString.length()) {
            if (hashSet.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                hashSet.add(newString);
                return;
            }
        }

        char currChar = givenString.charAt(index);
        //to be
        uniqueSubsequences1(givenString, index + 1, newString + currChar,hashSet);
        //not to be
        uniqueSubsequences1(givenString, index + 1, newString,hashSet);
    }
}
