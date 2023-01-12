package arrays;

import java.util.Arrays;

class RunningSum {
    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        int[] ints = runningSum.runningSum1(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(ints));
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public int[] runningSum1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

