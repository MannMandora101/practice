package arrays;

class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pair++;
                }
            }
        }
        return pair;
    }

    public static void main(String args[]) {
        NumIdenticalPairs numIdenticalPairs = new NumIdenticalPairs();
        System.out.println(numIdenticalPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
}