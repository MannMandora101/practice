package BT.BST;
/*
  @created 13/06/22
  @author  manish.mandora
*/

public class IncreasingBST {
    TreeNode newRoot = new TreeNode();
    TreeNode returnNode = newRoot;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return returnNode.right;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        newRoot.right = new TreeNode(root.val);
        newRoot = newRoot.right;
        inorder(root.right);
    }
}

class Solution {

    static TreeNode temp = null; //step 1
    static TreeNode newroot = null; //step 2

    public TreeNode increasingBST(TreeNode root) {
        temp = null; //step 2

        inorder(root); //step 3

        return newroot;   //step 4
    }

    public static void inorder(TreeNode root) {

        if (root == null) return; //step 5

        inorder(root.left); // step 6

        if (temp == null) { //step 7
            TreeNode nn = new TreeNode(root.val);
            temp = nn;  //step 8
            newroot = nn; //step 9
        } else { //step 10
            TreeNode nn1 = new TreeNode(root.val);
            temp.right = nn1; //step 11
            temp = nn1; //step 12
        }

        inorder(root.right);  //step 13

    }
}