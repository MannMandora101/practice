package Graph;/* 
  @created 12/01/23
  @author  manish.mandora

Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
Output: 8
Explanation: The figure above represents the given tree where red vertices have an apple. One optimal path to collect all apples is shown by the green arrows.
*/

import java.util.ArrayList;
import java.util.List;

public class MinimumTimeCollectAllApplesTree {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return dfs(0, adj, visited, hasApple);
    }

    private int dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Boolean> hasApple) {
        int time = 0;
        visited[node] = true;
        for (int adjacentNode : adj.get(node)) {
            if (!visited[adjacentNode]) {
                time += dfs(adjacentNode, adj, visited, hasApple);
            }
        }
        if (hasApple.get(node) || time > 0) {
            time += 2;
        }
        return time;
    }


}
