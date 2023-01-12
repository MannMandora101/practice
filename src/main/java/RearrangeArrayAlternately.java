/*
Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.

 */


import java.util.HashSet;
import java.util.Set;

class RearrangeArrayAlternately {

    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static long[] rearrange(long[] arr, int n) {
        int i, j;
        int max = (int) (arr[n - 1] + 1);
        j = n - 1;
        for (i = 0; i < n; i += 2) {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j--;
        }
        j = 0;
        for (i = 1; i < n; i += 2) {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j++;
        }

        for (i = 0; i < n; i++) {
            arr[i] = arr[i] / max;
        }

        return arr;

    }


    //A[] = {1,2,5,4,0}
    //B[] = {2,4,5,0,1}
    //5
    //20 6 17 15 19
    //6 17 20 19 19
    public static boolean check(long A[], long B[], int N) {
        Set<Long> set = new HashSet<>();
        boolean check = false;
        for (long l : A) {
            set.add(l);
        }
        for (long l : B) {
            if (set.contains(l)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        return check;
    }

    public static void main(String[] args) {
        long[] rearrange = rearrange(new long[]{1, 2, 3, 4, 5, 6}, 6);


        System.out.println(check(new long[]{20,6,17,15,19},new long[]{6,17,20,19,19},5));
    }

}