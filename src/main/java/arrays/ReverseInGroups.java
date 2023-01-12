package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//not working
class ReverseInGroups {
    void reverseInGroups(List<Integer> arr, int n, int k) {
        for (int i = 0; i < arr.size(); i = i + k) {

        }
    }

    void reverseInGroups(int arr[], int k) {
        for (int i = 0; i < arr.length; i = i + k) {
            int start =i;
            int end = Math.min(i + k - 1, arr.length - 1);
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseInGroups reverseInGroups = new ReverseInGroups();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseInGroups.reverseInGroups(ints,3);
        System.out.println(Arrays.toString(ints));
    }
}