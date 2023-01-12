package BT.BST;/* 
  @created 13/06/22
  @author  manish.mandora
*/

public class GetTargetCopy {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode leftNode = getTargetCopy(original.left, cloned.left, target);
        if(leftNode!=null){
            return leftNode;
        }
        return getTargetCopy(original.right,cloned.right,target);
    }
}
