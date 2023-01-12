package arrays;

class MaxProduct {
    public int maxProduct(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 1;
            for (int j = i; j < nums.length; j++) {
                currSum = currSum * nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.maxProduct(new int[]{2,3,-2,4}));
    }
}