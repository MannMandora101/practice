package recursion;/* 
  @created 27/05/22
  @author  manish.mandora
*/

public class TowerOFHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }

    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk : " + n + " from ->" + src + " to ->" + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("transfer disk : " + n + " from ->" + src + " to ->" + destination);
        towerOfHanoi(n - 1, helper, src, destination);

    }

}
