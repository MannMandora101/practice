package arrays;

/*
Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]
*/

import java.util.Arrays;

class CumulativeSum {
   static int[] getCumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr []={1, 2, 3, 4};
        System.out.println(Arrays.toString(getCumulativeSum(arr)));
    }
}