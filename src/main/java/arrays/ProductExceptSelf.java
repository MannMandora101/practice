package arrays;

import java.util.Arrays;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int product = 1;
        for (int i = 0; i < size; i++) {
            product = 1;
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                }
                product = product * nums[j];
            }
            result[i] = product;
        }
        return result;
    }

    public int[] productExceptSelf_(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int curr = 1;
        for (int i = 0; i < size; i++) {
            result[i] = curr;
            curr *= nums[i];
        }

        curr = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] *= curr;
            curr *= nums[i];
        }
        return result;
    }

    //prefix-suffix approach

    public static void main(String[] args) {
        ProductExceptSelf exceptSelf = new ProductExceptSelf();
        System.out.println(Arrays.toString(exceptSelf.productExceptSelf_(new int[]{1, 2, 3, 4})));
    }

}