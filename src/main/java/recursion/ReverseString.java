package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class ReverseString {
    public static void main(String[] args) {
        String str = "Manish";
        int index = str.length()-1;
        printString(str, index);
    }

    public static void printString(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printString(str, idx - 1);
    }
}
