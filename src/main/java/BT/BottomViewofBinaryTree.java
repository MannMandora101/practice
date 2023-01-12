package BT;
/*
  @created 17/06/22
  @author  manish.mandora


  Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100


*/

import java.util.*;

public class BottomViewofBinaryTree {

    static class info {
        int hd;
        TreeNode node;

        public info(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }

    static ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<info> queue = new LinkedList<>();
        queue.add(new info(0, root));
        while (!queue.isEmpty()) {
            info currNode = queue.remove();
            map.put(currNode.hd, currNode.node.data);
            if (currNode.node.left != null) {
                queue.add(new info(currNode.hd - 1, currNode.node.left));
            }
            if (currNode.node.right != null) {
                queue.add(new info(currNode.hd + 1, currNode.node.right));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}
