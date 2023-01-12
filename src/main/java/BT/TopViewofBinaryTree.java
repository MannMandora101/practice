package BT;/* 
  @created 17/06/22
  @author  manish.mandora


  Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100


Output: 40 20 10 30 100
*/

import java.util.*;

public class TopViewofBinaryTree {
    //Function to return a list of nodes visible from the top view
    //from left to right in Binary Tree.


    static class info {
        int hd;
        TreeNode node;

        public info(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }

    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<info> queue = new LinkedList<>();
        queue.add(new info(0, root));
        while (!queue.isEmpty()) {
            info currInfo = queue.remove();
            if (!map.containsKey(currInfo.hd)) {
                map.put(currInfo.hd, currInfo.node.data);
            }
            if (currInfo.node.left != null) {
                queue.add(new info(currInfo.hd - 1, currInfo.node.left));
            }

            if (currInfo.node.right != null) {
                queue.add(new info(currInfo.hd + 1, currInfo.node.right));
            }
        }
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            result.add(entries.getValue());
        }
        return result;
    }
}
