package arrays;

class FindMin {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int findMin_(int[] nums) {
        int low = nums[0];
        int high = nums[nums.length - 1];
        int mid = (low + high) / 2;
        if (nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }
        if (nums[mid + 1] < nums[mid]) {
            return nums[mid + 1];
        }
        return mid;
    }

    public static void main(String[] args) {
        FindMin findMin = new FindMin();
        System.out.println(findMin.findMin(new int[]{3, 4, 5, 1, 2}));
    }
}
