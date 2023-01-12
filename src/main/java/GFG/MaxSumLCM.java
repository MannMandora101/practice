package GFG;/* 
  @created 23/11/22
  @author  manish.mandora
*/

public class MaxSumLCM {

    static long maxSumLCM_(int n) {
        long sum = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static long maxSumLCM(int n) {
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (n / i != i) {
                    sum = sum + n / i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(maxSumLCM(2));
        //System.out.println(maxSumLCM(5));
        System.out.println(maxSumLCM_(10));
    }

}
