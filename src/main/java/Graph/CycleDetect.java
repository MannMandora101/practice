package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class CycleDetect {
    // Function to detect cycle in an undirected graph.
    //TC: O(V+2E)
    //SC: O()
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                visited[i] = true;
                Queue<Pair1> queue = new LinkedList<>();
                queue.add(new Pair1(i, -1));

                while (!queue.isEmpty()) {
                    int node = queue.peek().node;
                    int parent = queue.peek().parent;
                    queue.remove();
                    for (int adjacent : adj.get(node)) {
                        if (!visited[adjacent]) {
                            visited[adjacent] = true;
                            queue.add(new Pair1(adjacent, node));
                        } else if (parent != adjacent) {
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }

    public boolean isCycleDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, adj, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int parent) {
        visited[src] = true;

        for (int adjacent : adj.get(src)) {
            if (!visited[adjacent]) {
                if (dfs(adjacent, visited, adj, parent)) {
                    return true;
                }
            }else if (parent != adjacent) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        CycleDetect obj = new CycleDetect();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

class Pair1 {
    int node;
    int parent;

    public Pair1(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}