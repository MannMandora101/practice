package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        Array: [1, 2, 3, 2, 1]
        Number of Identical Twins: 2
        Explanation:
        Identical Twins: [[1, 1], [2, 2]]
        Indexes: (0, 4), (1, 3)

        Array: [1, 2, 2, 3, 2, 1]
        Number of Identical Twins: 4
        Explanation:
        Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
        Indexes: (0, 5), (1, 2), (1, 4), (2, 4)

        Array: [1, 1, 1, 1]
        Number of Identical Twins: 6
        Explanation:
        Identical Twins: [[1, 1], [1, 1], [1, 1], [1, 1], [1, 1], [1, 1]]
        Indexes: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)

        */
// working as expected time complexity O(n)
class IdenticalTwinsCount {
    static int getIdenticalTwinsCount(int[] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (integerMap.containsKey(arr[i])) {
                integerMap.put(arr[i], integerMap.get(arr[i]) + 1);
            } else {
                integerMap.put(arr[i], 1);
            }
        }
        System.out.println(integerMap);
        int counter = 0;
        for (Map.Entry<Integer, Integer> map : integerMap.entrySet())
            if (map.getValue() >= 2) {
                counter++;
            }

        return counter;
    }

    public static void main(String a[]) {
        int aa[] = {1, 2, 3, 2, 1,3};
        System.out.println(getIdenticalTwinsCount(aa));
    }
}