package arrays.twoPointer;
/*
  @created 21/11/22
  @author  manish.mandora

  Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

import java.util.Arrays;

public class RotateArray {

    //brute force
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        k = k % length;
        for (int i = length - k; i < length; i++) {
            result[i - (length - k)] = nums[i];
        }

        for (int i = k; i < length; i++) {
            result[i] = nums[i - k];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = result[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    //optimised
    public void rotate_(int[] nums, int k) {
        k = k % 10;
        flip(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        flip(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        flip(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    private void flip(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotateArray.rotate_(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

    }
}
