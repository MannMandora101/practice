package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n - 2);
    }

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

}
