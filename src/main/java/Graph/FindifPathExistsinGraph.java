package Graph;
/*
  @created 18/12/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindifPathExistsinGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        //add empty nodes
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        //initialise visited
        boolean vis[] = new boolean[n];

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (bfs(i, adjList, vis, source, destination)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bfs(int start, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        vis[start] = true;
        boolean isSource = false;
        boolean isDestination = false;

        while (!queue.isEmpty()) {
            Integer node = queue.remove();
            if (node == source) {
                isSource = true;
            }

            if (node == destination) {
                isDestination = true;
            }

            for (int i : adjList.get(node)) {
                if (!vis[i]) {
                    queue.add(i);
                    vis[i] = true;
                }
            }
        }

        return (isSource && isDestination);
    }
}
