package stack;/* 
  @created 09/11/22
  @author  manish.mandora



  Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
*/

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (stack.size() > 0 && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                if (stack.size() > 0 && stack.peek() == -asteroid) {
                    stack.pop();
                } else if (stack.size() > 0 && stack.peek() > asteroid) {

                } else {
                    stack.push(asteroid);
                }
            }
        }

        int result[] = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision asteroidCollision=new AsteroidCollision();
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{5, 10, -5})));
    }
}
