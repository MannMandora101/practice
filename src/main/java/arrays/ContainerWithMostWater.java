package arrays;/* 
  @created 01/10/22
  @author  manish.mandora
*/

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int min = Math.min(height[i], height[j]);
                if (max < (j - i) * min) {
                    max = (j - i) * min;
                }
            }
        }
        return max;
    }

    public int maxArea_(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int breadth = j - i;
            int ht = Math.min(height[i], height[j]);
            max = Math.max(max,ht * breadth);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;
    }


   static long maxSubarraySum(int arr[], int n){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;

    }

    public static void main(String[] args) {
       // ContainerWithMostWater container = new ContainerWithMostWater();
        //System.out.println(container.maxArea_(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

        System.out.println(maxSubarraySum(new int[]{1,2,3,-2,5},5));


    }
}
