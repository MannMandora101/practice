package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];

    }

    public int findKthLargest_priorityQueue(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (queue.peek() < nums[i]) {
                queue.poll();
                queue.add(nums[i]);
            }
        }

        return queue.peek();

    }

    public static void main(String args[]) {
        FindKthLargest findKthLargest = new FindKthLargest();
        System.out.println(findKthLargest.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest.findKthLargest_priorityQueue(new int[]{3, 2, 1, 5, 6, 4}, 2));

    }
}