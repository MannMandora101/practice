package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(calPower(3,3));
    }

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpownm1 = calPower(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;
    }

}
