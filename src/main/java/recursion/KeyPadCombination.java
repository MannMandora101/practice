package recursion;
/*
  @created 27/05/22
  @author  manish.mandora
*/

public class KeyPadCombination {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, index + 1, combination + mapping.charAt(i));
        }
    }


    public static void main(String[] args) {
        printCombination("23", 0, "");
    }
}
