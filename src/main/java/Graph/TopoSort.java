package Graph;

import java.util.ArrayList;
import java.util.Stack;

class TopoSort {
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited = new int[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, stack, adj);
            }
        }

        int ans[] = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i] = stack.peek();
            stack.pop();
            i++;
        }
        return ans;
    }

    private static void dfs(int node, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = 1;
        for (int adjacentNode : adj.get(node)) {
            if (visited[adjacentNode] == 0) {
                dfs(adjacentNode, visited, stack, adj);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = TopoSort.topoSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }
}