package BT;/* 
  @created 07/06/22
  @author  manish.mandora
*/

import java.util.LinkedList;
import java.util.Queue;

public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> ques = new LinkedList<>();
        ques.add(root);
        while (!ques.isEmpty()) {
            TreeNode temp = ques.remove();
            int tmpValue = temp.data;
            int leftValue = 0, rightValue = 0;
            if (temp.left != null) {
                leftValue = temp.left.data;
            }
            if (temp.right != null) {
                rightValue = temp.right.data;
            }

            if (tmpValue == (leftValue + rightValue)) {
                return true;
            }
        }
        return false;
    }
}

