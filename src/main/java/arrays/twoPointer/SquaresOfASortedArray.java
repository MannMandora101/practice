package arrays.twoPointer;
/*
  @created 18/11/22
  @author  manish.mandora

  Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
*/

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }


  /*  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 =m - 1;
        int p2 = n - 1;
       for (int i = m + n - 1; i >= 0; i--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
               p1--;
            } else {
                nums1[i] = nums2[p2];
               p2--;
            }
        }


        System.out.println(Arrays.toString(nums1));

    }



    public static void main(String[] args) {
        SquaresOfASortedArray squares = new SquaresOfASortedArray();
        System.out.println(Arrays.toString(squares.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        squares.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
