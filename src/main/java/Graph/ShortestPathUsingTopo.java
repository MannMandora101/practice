package Graph;


import java.util.ArrayList;
import java.util.Stack;

class ShortestPathUsingTopo {


    public int[] shortestPath(int N, int M, int[][] edges) {
        ArrayList<ArrayList<Pairs>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Pairs> temp = new ArrayList<>();
            adj.add(temp);
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pairs(v, wt));
        }

        int[] visited = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) {
                toposort(i, adj, visited, stack);
            }
        }

        int[] dist = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = (int) 1e9;
        }
        dist[0] = 0;

        while (!stack.isEmpty()) {
            int node = stack.peek();
            stack.pop();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if (dist[node] + wt < dist[v]) {
                    dist[v] = wt + dist[node];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (dist[i] == 1e9) dist[i] = -1;
        }
        return dist;
    }

    private void toposort(int node, ArrayList<ArrayList<Pairs>> adj,
                          int vis[], Stack<Integer> st) {
        vis[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            if (vis[v] == 0) {
                toposort(v, adj, vis, st);
            }
        }
        st.add(node);
    }
}
