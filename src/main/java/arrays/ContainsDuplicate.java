package arrays;

import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniq.add(nums[i]);
        }
        if (nums.length == uniq.size()) {
            return false;
        }
        return true;
    }


    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(duplicate.containsDuplicate1(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}