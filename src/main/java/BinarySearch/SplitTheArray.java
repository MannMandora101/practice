package BinarySearch;/* 
  @created 17/12/22
  @author  manish.mandora
*/

public class SplitTheArray {

    static int splitArray(int[] a , int N, int K) {
        int max = 0;
        int sum = 0;

        for (int value : a) {
            max = Math.max(value, max);
            sum = sum + value;
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(a, mid,K)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean isPossible(int[] a, int mid,int k) {
        int sa = 1;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > mid) {
                sa++;
                sum = a[i];
            }
        }

        return sa <= k;
    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1, 2, 3, 4},4,3));
    }

}
