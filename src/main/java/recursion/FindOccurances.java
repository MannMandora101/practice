package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class FindOccurances {
    public static int firstIdex = -1;
    public static int lastIndex = -1;

    public static void main(String[] args) {
        findOccurances("abaacdaefaah", 0, 'a');
    }

    public static void findOccurances(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println("first : " + firstIdex);
            System.out.println("last : " + lastIndex);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (firstIdex == -1) {
                firstIdex = idx;
            } else {
                lastIndex = idx;
            }
        }
        findOccurances(str, idx + 1, element);
    }
}
