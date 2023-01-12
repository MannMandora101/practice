package arrays;/* 
  @created 05/11/22
  @author  manish.mandora
*/

public class CheckArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int x=0;
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>nums[(i+1)%n]){
                x++;
            }
            if(x>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckArrayIsSortedAndRotated rotated=new CheckArrayIsSortedAndRotated();
        System.out.println(rotated.check(new int[]{3,4,5,1,2}));
    }
}
