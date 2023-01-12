package Graph;

import java.util.ArrayList;
// SC--O(N)+O(N)
//Time Complexity: O(N) + O(V+2E)
class NumProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        //convert matrix into list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjacencyList.get(i).add(j);
                    adjacencyList.get(j).add(i);
                }
            }
        }

        int[] visited = new int[V];
        int province = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                province++;
                dfs(i, visited, adjacencyList);
            }
        }
        return province;
    }

    private static void dfs(int start, int[] visited, ArrayList<ArrayList<Integer>> adjacencyList) {
        visited[start] = 1;
        for (int node : adjacencyList.get(start)) {
            if (visited[node] == 0) {
                dfs(node, visited, adjacencyList);
            }
        }
    }

    public static void main(String[] args)
    {

        // adjacency matrix
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);

        NumProvinces ob = new NumProvinces();
        System.out.println(ob.numProvinces(adj,3));
    }
}