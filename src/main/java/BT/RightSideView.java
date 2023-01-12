package BT;/* 
  @created 05/06/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode remove = queue.remove();
                if (size == 0) {
                    result.add(remove.data);
                }
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
            }
        }
        return result;
    }


    public List<Integer> rightSideViewRecurr(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        ArrayList<TreeNode> nodes=new ArrayList<>();
       // rightSideViewRecusive(root,nodes,0);
       return result;
    }

}
