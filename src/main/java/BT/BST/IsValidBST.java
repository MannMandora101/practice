package BT.BST;
/*
  @created 12/06/22
  @author  manish.mandora
*/

public class IsValidBST {
    TreeNode prevNode = null;

    public boolean isValidBST(TreeNode root) {
        if (root != null) {
            boolean validBST = isValidBST(root.left);
            if (!validBST) {
                return false;
            }
            if (prevNode != null && root.val <= prevNode.val) {
                return false;
            }
            prevNode = root;
            return isValidBST(root.right);
        }
        return true;
    }

    public boolean isValidBST1(TreeNode root) {
        //for every node, maintain upper bound and lowerbound
        //helper func(root, lower bound, upper bound) - for recursion
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean helper(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;
        //update the lower bound for right subtree and upper bound for left subtree
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
