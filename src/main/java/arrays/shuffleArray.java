package arrays;

import java.util.Arrays;

class shuffleArray {

    //brute force
    //time complexity O(2n)-->O(n)
    //space complexity O(2n)-->O(n)
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for (int i = 0; i < 2 * n; i = i + 2) {
            result[i] = nums[j];
            result[i + 1] = nums[j + n];
            j++;
        }
        return result;
    }

    //optimisatiion

    public int[] shuffle_opt(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i + n] += nums[i] * 1005;
        }

        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[i + n]/1005;
            nums[2 * i + 1] = nums[i + n] % 1005;
        }
        return nums;
    }


    public static void main(String[] args) {
        shuffleArray shuffleArray = new shuffleArray();
        System.out.println("brute force : -> " + Arrays.toString(shuffleArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println("optimisation approach : -> " + Arrays.toString(shuffleArray.shuffle_opt(new int[]{2, 5, 1, 3, 4, 7}, 3)));

    }
}