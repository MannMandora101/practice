package recursion;
/*
  @created 27/05/22
  @author  manish.mandora
*/

public class MoveAllGivenElementToLast {
    public static void main(String[] args) {
        moveAllX("axbcxxd", 0, 0, "");
    }

    public static void moveAllX(String givenString, int index, int count, String newString) {
        if (index == givenString.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println("new String : " + newString);
            return;
        }
        char currchar = givenString.charAt(index);
        if (currchar == 'x') {
            count++;
            moveAllX(givenString, index + 1, count, newString);
        } else {
            newString += currchar;
            moveAllX(givenString, index + 1, count, newString);
        }
    }


}
