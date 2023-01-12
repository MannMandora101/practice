package BT.BST;
/*
  @created 08/12/22
  @author  manish.mandora
*/

public class KthSmallestElementInBST {
    int result;
    public int KthSmallestElement(TreeNode root, int K) {
        return  inorder(root, K,new int[]{0});

    }

    private int inorder(TreeNode root, int k, int count[]) {
        if (root == null) {
            return -1;
        }
        int left=inorder(root.left, k, count);
        if(left!=-1){
            return left;
        }
        count[0]++;
        if (k == count[0]) {
            return root.val;
        }
        return inorder(root.right, k, count);
    }
}
