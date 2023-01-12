package BT;
/*
  @created 03/10/22
  @author  manish.mandora
*/

import java.util.*;

public class DistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();

        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        markParent(parentMap, root);

        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();
                visited.add(currentNode);
                if (k == 0) {
                    result.add(currentNode.data);
                }
                if (parentMap.containsKey(currentNode) && !visited.contains(parentMap.get(currentNode))) {
                    queue.add(parentMap.get(currentNode));
                }
                if (currentNode.left != null && !visited.contains(currentNode.left)) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null && !visited.contains(currentNode.right)) {
                    queue.add(currentNode.right);
                }
            }
            k--;
            if (k < 0) {
                break;
            }
        }
        return result;
    }

    private void markParent(HashMap<TreeNode, TreeNode> parentMap, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            parentMap.put(root.left, root);
        }
        if (root.right != null) {
            parentMap.put(root.right, root);
        }
        markParent(parentMap, root.left);
        markParent(parentMap, root.right);
    }


    public static void main(String args[]) {
        DistanceK distanceK=new DistanceK();
        //System.out.println(distanceK.distanceK());
    }
}

