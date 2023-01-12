package BT;
/*
  @created 08/06/22
  @author  manish.mandora
*/

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.remove();
            TreeNode tmpLeft=currNode.left;
            TreeNode tmpRight=currNode.right;

            if (currNode.left != null && currNode.right != null) {
                currNode.left = tmpRight;
                queue.add(currNode.left);
            }
            if (currNode.right != null && currNode.left != null) {
                currNode.right = tmpLeft;
                queue.add(currNode.right);
            }

        }
        return root;
    }


    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.remove();
            if (currNode != null) {
                queue.add(currNode.left);
                queue.add(currNode.right);
                TreeNode tmp = currNode.left;
                currNode.left = currNode.right;
                currNode.right = tmp;
            }
        }
        return root;
    }
}
