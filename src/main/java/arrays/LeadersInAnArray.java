package arrays;/* 
  @created 08/01/23
  @author  manish.mandora


  Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[], int n) {
        int rmax = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= rmax) {
                rmax = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(leaders(new int[]{16, 17, 4, 3, 5, 2}, 6));
    }
}
