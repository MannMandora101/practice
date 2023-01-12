package BT;/* 
  @created 02/06/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTrees {
    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }



        static class BT {
            static int index = -1;

            public static Node buildTree(int nodes[]) {
                index++;
                if (nodes[index] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
        }

        //Root-left-right
        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");// -1 for NUll nodes
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //-left-root-right
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }


        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> nodeQueue = new LinkedList<>();
            nodeQueue.add(root);
            nodeQueue.add(null);
            while (!nodeQueue.isEmpty()) {
                Node currNode = nodeQueue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (nodeQueue.isEmpty()) {
                        break;
                    } else {
                        nodeQueue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        nodeQueue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        nodeQueue.add(currNode.right);
                    }
                }
            }
        }


        //-left-root-right
        public static List<Integer> inOrders(Node root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            list = inOrders(root.left, list);
            list.add(root.data);
            list = inOrders(root.right, list);
            return list;
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BT bt = new BT();
            Node root = BT.buildTree(nodes);
            //System.out.print(root.data);

            preOrder(root);
            System.out.println();
            inOrder(root);
            System.out.println();
            postOrder(root);
            System.out.println();
            levelOrder(root);

            System.out.println();
            List<Integer> integers = inOrders(root, new ArrayList<Integer>());
            System.out.println(integers);
        }


    }
