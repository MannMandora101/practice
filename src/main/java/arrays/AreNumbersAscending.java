package arrays;/* 
  @created 07/11/22
  @author  manish.mandora

  Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
Output: true
Explanation: The numbers in s are: 1, 3, 4, 6, 12.
They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.
*/

import java.util.Arrays;

public class AreNumbersAscending {

    public boolean areNumbersAscending(String s) {
        int length = s.length();
        int previous = 0;
        String[] str = s.split(" ");
        for (String s1 : str) {
            if (Character.isDigit(s1.charAt(0))) {
                int num = Integer.parseInt(s1);
                if (num <= previous) {
                    return false;
                } else {
                    previous = num;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AreNumbersAscending areNumbersAscendin = new AreNumbersAscending();
        System.out.println(areNumbersAscendin.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));

        String d = "M1 D3 A4 P2";
        StringBuilder builder = new StringBuilder();
        String[] split = d.split(" ");
        String[] helper = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            int idx = split[i].charAt(split[i].length() - 1) - '0';
            System.out.println(idx);
            helper[idx - 1] = split[i].substring(0, split[i].length() - 1);
        }
        for (int i = 0; i < helper.length; i++) {
            builder.append(helper[i]).append(" ");
        }
        System.out.println(builder.toString());




    }

}

