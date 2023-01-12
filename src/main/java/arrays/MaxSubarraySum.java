package arrays;
/*
  @created 08/01/23
  @author  manish.mandora
*/

public class MaxSubarraySum {

    static long maxSubarraySum(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;

    }


    //kadane's algo
    static long maxSubarraySum_(int arr[], int n) {
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }




    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{1, 2, 3, -2, 5}, 5));


    }

}
