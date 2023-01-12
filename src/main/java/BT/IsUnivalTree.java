package BT;/* 
  @created 14/06/22
  @author  manish.mandora
*/

public class IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }

        boolean left = isUnivalTree(root.left);
        boolean right = isUnivalTree(root.right);
        return left && right;
    }
}
