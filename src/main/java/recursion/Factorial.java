package recursion;
/*
  @created 27/05/22
  @author  manish.mandora
*/

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calFactorial(5));
    }


    public static int calFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factnm1 = calFactorial(n - 1);
        int factn = n * factnm1;
        return factn;

    }
}
