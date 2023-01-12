package arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 1;
        while (set.contains(i)) {
            i++;
        }
        return i;

    }

    public int firstMissingPositive_(int[] nums) {
        int n = nums.length;
        boolean one = false;
        // step1: mark the elements which are out of range and manage the presesnce of 1
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                one = true;
            }
            if (nums[i] < 1 || n < nums[i]) {
                nums[i] = 1;
            }
        }
        if (!one) {
            return 1;
        }

        //step 2: map elements with index
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]);
            nums[index - 1] = -Math.abs(nums[index - 1]);
        }

        //find missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;


    }

    public static void main(String[] args) {
        FirstMissingPositive missingPositive = new FirstMissingPositive();
        System.out.println(missingPositive.firstMissingPositive_(new int[]{3, 4, -1, 1}));
    }
}
