package arrays;/* 
  @created 09/01/23
  @author  manish.mandora


  Input:
N = 3
A[] = {1,2,3}
Output:
-1
Explanation:
Since, each element in
{1,2,3} appears only once so there
is no majority element.


*/

public class MajorityElement {

    //moore's voting algorithm
    static int majorityElement(int a[], int size) {
        int val = a[0];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (val == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                val = a[i];
                count = 1;
            }
        }


        int freq=0;
        for (int i = 0; i < a.length; i++) {
            if(val==a[i]){
                freq++;
            }
        }

        if(freq>size/2){
            return val;
        }
        return val;
    }

}
