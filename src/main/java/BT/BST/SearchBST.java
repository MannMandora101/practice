package BT.BST;
/*
  @created 13/06/22
  @author  manish.mandora
*/

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }

        if(root.val> val){
            return searchBST(root.left,val);
        }else {
            return searchBST(root.right,val);
        }

    }
}
