package arrays;
/*
  @created 06/12/22
  @author  manish.mandora


  Input:  [2, 5, 3, 7, 8, 1, 9]
Output: [-1, 2, 2, 3, 7, -1, 1]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmallestNumber {

    public List<Integer> printNumbers(int a[]) {
        List<Integer> result = new ArrayList<>();
        result.add(-1);
        for (int i = 1; i < a.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    result.add(a[j]);
                    break;
                }
            }
            if (j == -1) {
                result.add(-1);
            }
        }
        return result;
    }


    public List<Integer> printNumbers1(int a[]) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            stack.push(a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        PreviousSmallestNumber smallerElement = new PreviousSmallestNumber();
        System.out.println(smallerElement.printNumbers(new int[]{2, 5, 3, 7, 8, 1, 9}));
        System.out.println(smallerElement.printNumbers1(new int[]{2, 5, 3, 7, 8, 1, 9}));

    }
}
