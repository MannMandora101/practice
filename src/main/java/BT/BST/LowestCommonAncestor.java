package BT.BST;
/*
  @created 12/06/22
  @author  manish.mandora
*/


public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val < root.val && q.val < root.val) {
            lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
