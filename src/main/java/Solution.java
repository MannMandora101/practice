import java.util.*;


/*
Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above
block of height 4 is 3 units and above
block of height 0 is 7 units. So, the
total unit of water trapped is 10 units.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Map<Character, Character> mapS = new HashMap<>();

        Map<Character, Character> mapT = new HashMap<Character, Character>();
        for (int i = 0; i < sChar.length; i++) {
            if (!mapT.containsKey(s.charAt(i))) {
                mapT.put(s.charAt(i), t.charAt(i));
            }
            sChar[i] = mapT.get(s.charAt(i));

            if (!mapS.containsKey(t.charAt(i))) {
                mapS.put(t.charAt(i), s.charAt(i));
            }
            tChar[i] = mapS.get(t.charAt(i));
        }

        String ss = new String(sChar);
        System.out.println(ss);
        String tt = new String(sChar);
        System.out.println(tt);
        if (s.equals(tt) && t.equals(ss)) {
            return true;
        }
        return false;
    }


    static long trappingWater(int arr[], int n) {

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + (Math.min(left[i], right[i]) - arr[i]);
        }

        return result;

    }

    /*

    Input: rains = [1,2,0,0,2,1]
Output: [-1,-1,2,1,-1,-1]
Explanation: After the first day full lakes are [1]
After the second day full lakes are [1,2]
After the third day, we dry lake 2. Full lakes are [1]
After the fourth day, we dry lake 1. There is no full lakes.
After the fifth day, full lakes are [2].
After the sixth day, full lakes are [1,2].
It is easy that this scenario is flood-free. [-1,-1,1,2,-1,-1] is another acceptable scenario.
     */

    public static int[] avoidFlood(int[] rains) {
        int size = rains.length;
        HashMap<Integer, Integer> lastRain = new HashMap<>();
        TreeSet<Integer> dry = new TreeSet<>();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int x = rains[i];
            if (x == 0) {
                dry.add(i);
            } else {
                Integer id = lastRain.get(x);
                if (id == null) {
                    lastRain.put(x, i);
                } else {
                    Integer dryThisDay = dry.higher(id);
                    if (dryThisDay == null) {
                        return new int[0];
                    }
                    result[dryThisDay] = x;
                    dry.remove(dryThisDay);
                    lastRain.put(x, i);
                }
                result[i] = -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("paper", "title"));
        System.out.println(trappingWater(new int[]{3, 0, 0, 2, 0, 4}, 6));
        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,0,2,1})));

    }
}