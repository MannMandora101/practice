package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class CalculatePowLogn {
    public static void main(String[] args) {
        System.out.println(calPower(2, 5));
    }

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        //if n is even
        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else {
            //n is odd
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

}
