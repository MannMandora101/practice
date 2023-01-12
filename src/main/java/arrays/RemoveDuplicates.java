package arrays;
/*
  @created 11/05/22
  @author  manish.mandora

 Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class RemoveDuplicates {
    public static void main(String[] args) {
     RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        int count = removeDuplicates.removeDuplicate(new int[]{1, 1, 2});
        System.out.println(count);
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        if(nums.length==0){
            return count;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    public int removeDuplicate(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j]=nums[i+1];
                j++;
            }

        }
        return j;
    }
}
