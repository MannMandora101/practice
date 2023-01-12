package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class AllienDictionary {
    public String findOrder(String[] dict, int N, int K) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            String s1 = dict[i];
            String s2 = dict[i + 1];
            int l = Math.min(s1.length(), s2.length());

            for (int ptr = 0; ptr < l; ptr++) {
                if (s1.charAt(ptr) != s2.charAt(ptr)) {
                    adj.get(s1.charAt(ptr) - 'a').add(s2.charAt(ptr) - 'a');
                    break;
                }
            }
        }
        List<Integer> list = topoSort(K, adj);
        String ans = "";
        for (Integer integer : list) {
            ans = ans + (char) (integer + 'a');
        }
        return ans;
    }

    private static void dfs(int node, int[] visited, Stack<Integer> stack, List<List<Integer>> adj) {
        visited[node] = 1;
        for (int adjacentNode : adj.get(node)) {
            if (visited[adjacentNode] == 0) {
                dfs(adjacentNode, visited, stack, adj);
            }
        }
        stack.push(node);
    }

    static List<Integer> topoSort(int V, List<List<Integer>> adj) {
        int[] visited = new int[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, stack, adj);
            }
        }

        //int ans[] = new int[V];
        List<Integer> topo = new ArrayList<>();
        int i = 0;
        while (!stack.isEmpty()) {
            // ans[i] = stack.peek();
            topo.add(stack.peek());
            stack.pop();
            i++;
        }
        return topo;
    }

}