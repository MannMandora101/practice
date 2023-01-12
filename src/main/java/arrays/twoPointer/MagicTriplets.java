package arrays.twoPointer;/* 
  @created 23/11/22
  @author  manish.mandora
*/

public class MagicTriplets {

    public int countTriplets(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 1; i < n - 2; i++) {
            int smaller = 0;
            int greater = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i])
                    smaller++;
            }

            for (int k = i + 1; k < n; k++) {
                if (nums[k] > nums[i])
                    greater++;
            }

            result = result + (smaller * greater);
        }

        return result;
    }

}
