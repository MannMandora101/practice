package BT;
/*
  @created 06/06/22
  @author  manish.mandora
*/

public class CountNodes {
    public int countNodes(TreeNode root) {
      if(root==null){
          return 0;
      }
      int leftNodes=countNodes(root.left);
      int rightNodes=countNodes(root.right);
      return leftNodes+rightNodes+1;
    }
}
