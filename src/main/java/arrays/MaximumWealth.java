package arrays;

class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum >= maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        MaximumWealth maximumWealth = new MaximumWealth();
        System.out.println(maximumWealth.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }
}