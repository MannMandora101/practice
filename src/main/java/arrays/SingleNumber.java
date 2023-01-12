package arrays;/* 
  @created 05/11/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            } else {
                list.remove(new Integer(num));
            }
        }
        return list.get(0);
    }


    public int singleNumber_(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }

}
