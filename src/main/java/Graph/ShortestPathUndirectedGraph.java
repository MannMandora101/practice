package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class ShortestPathUndirectedGraph {

    public int[] shortestPath(int[][] edges, int n, int m, int src) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int) 1e9;
        }

        dist[src] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            int node = queue.peek();
            queue.remove();
            for (int it : adj.get(node)) {
                if (dist[node] + 1 < dist[it]) {
                    dist[it] = 1 + dist[node];
                    queue.add(it);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dist[i] == 1e9) {
                dist[i] = -1;
            }
        }
        return dist;
    }
}