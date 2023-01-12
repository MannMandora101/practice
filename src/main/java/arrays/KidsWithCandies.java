package arrays;

import java.util.ArrayList;
import java.util.List;

class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean isCandy = false;
            for (int j = 0; j < candies.length; j++) {
                if (extraCandies + candies[i] < candies[j]) {
                    isCandy = true;
                    break;
                }
            }
            if (isCandy) {
                result.add(false);
            } else {
                result.add(true);
            }

        }
        return result;
    }

    public List<Boolean> kidsWithCandiess(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -999999;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int candy : candies) {
            result.add(candy >= max - extraCandies);
        }
        return result;
    }


    public static void main(String args[]) {
        KidsWithCandies withCandies = new KidsWithCandies();
        System.out.println(withCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(withCandies.kidsWithCandiess(new int[]{2, 3, 5, 1, 3}, 3));

    }
}