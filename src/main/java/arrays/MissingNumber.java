package arrays;/* 
  @created 05/11/22
  @author  manish.mandora
*/

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int i = 1;
        while (set.contains(i)) {
            if (set.size() == 1) {
                return i;
            }
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber=new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{1}));
    }

}
