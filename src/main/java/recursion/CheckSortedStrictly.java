package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class CheckSortedStrictly {
    public static void main(String[] args) {
        System.out.println(isSorted1(new int[]{1, 2, 3, 4, 5}, 0));
    }

    public static boolean isSorted(int array[], int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] < array[index + 1]) {
            //array is sorted till now
            return isSorted(array, index + 1);
        } else {
            return false;
        }
    }


    public static boolean isSorted1(int array[], int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] >= array[index + 1]) {
            //array is unsorted
            return false;
        }
        return isSorted(array, index + 1);
    }

}
