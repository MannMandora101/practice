package BT;
/*
  @created 23/06/22
  @author  manish.mandora

  Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]


pre order
*/

public class FlattenBinaryTreeToLinkedList {
    TreeNode head = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null || root.right == null) {
            return;
        }

        head = root;
        flatten(root.left);


    }
}
