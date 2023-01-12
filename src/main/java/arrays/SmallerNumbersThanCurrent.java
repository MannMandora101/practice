package arrays;

import java.util.Arrays;

class SmallerNumbersThanCurrent {

    //Brute force
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < currentNumber) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String args[]) {
        SmallerNumbersThanCurrent current = new SmallerNumbersThanCurrent();
        System.out.println(Arrays.toString(current.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
}