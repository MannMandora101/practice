package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*      Initial Array: [1, -2, 3, 4, -6]
		Cumulative Sum: [1, -1, 2, 6, 0]

		Initial Array: [1, -1, -1, -1, 1]
		Cumulative Sum: [1, 0, -1, -2, -1]

		Initial Array: [1, 3, 5, 7]
		Cumulative Sum: [1, 4, 9, 16]

		Initial Array: [1, -2, 3, 4, -6]
 		Cumulative Sum: [1, -1, 2, 6, 0]
		Positive Cumulative Sum: [1, 2, 6]
		*/

class PositiveCumulativeSum {
    static List<Integer> getPositiveCumulativeSum(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int[] cumulativeSum = getCumulativeSum(arr);
        System.out.println(Arrays.toString(cumulativeSum));
        for (int i = 0; i < cumulativeSum.length; i++) {
            if (cumulativeSum[i] > 0) {
                result.add(cumulativeSum[i]);
            }
        }

        return result;
    }

    static int[] getCumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;

        }
        return arr;
    }

    public static void main(String args[]) {
        int a[] = {1, -2, 3, 4, -6};
        System.out.println((getPositiveCumulativeSum(a)));
    }
}