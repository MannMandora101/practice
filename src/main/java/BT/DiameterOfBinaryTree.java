package BT;
/*
  @created 09/06/22
  @author  manish.mandora
*/

public class DiameterOfBinaryTree {
    //time complexity O(n^2)
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameterOfBinaryTree(root.left);
        int diam3 = diameterOfBinaryTree(root.right);
        return Math.max(diam1, Math.max(diam2, diam3));
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


}
