package BT;
/*
  @created 04/06/22
  @author  manish.mandora
*/

import java.util.*;

public class ZigzagLevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean level = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();
                
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }

                list.add(currNode.data);
            }
            if (level) {
                Collections.reverse(list);
            }
            result.add(list);
            level = !level;
        }
        return result;
    }
}
