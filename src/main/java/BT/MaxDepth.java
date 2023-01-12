package BT;/* 
  @created 07/06/22
  @author  manish.mandora
*/

public class MaxDepth {
    //depth is equivalent to level
    public Integer maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
