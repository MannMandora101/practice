package arrays;

import java.util.Arrays;

class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for (int i = 0; i < arr.length; i++) {
            if (nums.length - 1 < i) {
                arr[i] = nums[i - nums.length];
            } else {
                arr[i] = nums[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Concatenation concatenation = new Concatenation();
        int[] concatenation1 = concatenation.getConcatenation(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(concatenation1));
    }
}