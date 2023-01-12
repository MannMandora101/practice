package arrays;

/*
  @created 05/10/22
  @author  manish.mandora

  Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
*/

public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length;
        int r = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        if (r - l < 0) {
            return 0;
        } else {
            return r - l + 1;
        }
    }

    public static void main(String args[]) {
        FindUnsortedSubarray subarray = new FindUnsortedSubarray();
        System.out.println(subarray.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
