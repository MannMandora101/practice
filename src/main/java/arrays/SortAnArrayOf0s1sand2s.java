package arrays;
/*
  @created 08/01/23
  @author  manish.mandora

  Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
*/

public class SortAnArrayOf0s1sand2s {

    //dutch national flag algo
    public static void sort012(int a[], int n) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
