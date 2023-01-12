package Graph;
/*
  @created 19/12/22
  @author  manish.mandora
*/

import java.util.ArrayList;

public class DFSOFGraph {


    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjancencyList) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];
        visited[0] = true;
        dfs(0, visited, adjancencyList, list);
        return list;
    }

    private void dfs(int start, boolean[] visited, ArrayList<ArrayList<Integer>> adjancencyList, ArrayList<Integer> list) {
        visited[start] = true;
        list.add(start);
        for (int node : adjancencyList.get(start)) {
            if (!visited[node]) {
                dfs(node, visited, adjancencyList, list);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        DFSOFGraph dfs = new DFSOFGraph();
        ArrayList<Integer> ans = dfs.dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
