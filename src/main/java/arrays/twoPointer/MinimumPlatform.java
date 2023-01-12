package arrays.twoPointer;
/*
  @created 15/12/22
  @author  manish.mandora



Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.
*/

import java.util.Arrays;

public class MinimumPlatform {
    public int minimumPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int result = 1, platNeeded = 1;

        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                i++;
                platNeeded++;
            } else if (arr[i] > dep[j]) {
                platNeeded--;
                j++;
            }
        }
        return platNeeded;
    }

    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int count = 0;
        int ans = 0;

        int i = 0, j = 0;

        while (i < n) {
            if (arr[i] <= dep[j]) {
                count++;
                ans = Math.max(ans, count);
                i++;
            } else if (arr[i] > dep[j]) {
                count--;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        if (n % 2 == 0) {
            System.out.println("even" + n % 2);
        } else {
            System.out.println("odd");
        }

    }
}
