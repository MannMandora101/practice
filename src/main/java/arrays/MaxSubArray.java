package arrays;

import java.util.Arrays;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum = currSum + nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("max sum : " + maxSum);
        return maxSum;
    }


    public int maxContiguousSubarraySum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int maxi = 0;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {

            currSum += nums[i];
            if (currSum > maxi) {
                maxi = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxContiguousSubarraySum(new int[]{-1}));
    }
}