package arrays;/* 
  @created 15/09/22
  @author  manish.mandora
*/

public class SearchElementSortedAndPivotedArray {
    public static void main(String[] args) {
        SearchElementSortedAndPivotedArray array = new SearchElementSortedAndPivotedArray();
        System.out.println(array.searchElementSortedAndPivotedArray(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}));
    }

    private String searchElementSortedAndPivotedArray(int[] nums) {
        String message = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                message = "found at index : " + i;
                break;
            } else {
                message = "not found";
            }

        }
        return message;
    }

}
