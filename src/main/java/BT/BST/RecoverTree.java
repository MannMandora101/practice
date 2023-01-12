package BT.BST;
/*
@created 16/06/22
@author:manish.mandora

Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.

*/

public class RecoverTree {
    TreeNode prev = null;
    TreeNode t1 = null;
    TreeNode t2 = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp= t1.val;
        t1.val=t2.val;
        t2.val=temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        if (prev != null && prev.val > root.val) {
           if(t1==null){
               t1=prev;
           }
           t2=root;
        }

        prev=root;
        inorder(root.right);
    }
}
