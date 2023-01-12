package BT;/* 
  @created 19/06/22
  @author  manish.mandora



  Input:
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
      / \
     8   9

Output: 1 2 4 8 9 6 7 3
Explanation:

*/

import java.util.ArrayList;

public class BoundaryTraversalOfBinaryTree {

    ArrayList<Integer> boundary(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(root.data);
        leftBoundary(root.left, result);
        leafNodes(root.left, result);
        leafNodes(root.right, result);
        rightBoundary(root.right, result);
        return result;
    }

    private void leftBoundary(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            result.add(root.data);
            leftBoundary(root.left, result);
        }
        if (root.right != null) {
            result.add(root.data);
            leftBoundary(root.right, result);
        }
    }

    private void leafNodes(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        leafNodes(root.left, result);
        if (root.left == null && root.right == null) {
            result.add(root.data);
        }
        leafNodes(root.right, result);
    }

    private void rightBoundary(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            rightBoundary(root.right, result);
            result.add(root.data);
        }
        if (root.left != null) {
            rightBoundary(root.left, result);
            result.add(root.data);
        }
    }
}
