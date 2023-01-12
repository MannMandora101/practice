package Graph;
/*
  @created 07/12/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOfGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.remove();
            bfs.add(node);
            for (int it : adj.get(node)) {
                if (!vis[it]) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
