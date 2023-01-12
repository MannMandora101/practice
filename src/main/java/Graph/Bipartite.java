package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Bipartite {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!checkBipar(i, V, color, adj)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBipar(int start, int V, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
            Integer node = queue.peek();
            queue.remove();
            for (int adjacentNode : adj.get(node)) {
                if (color[adjacentNode] == -1) {
                    color[adjacentNode] = 1-color[node];
                    queue.add(adjacentNode);
                } else if (color[adjacentNode] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        // V = 4, E = 4
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Bipartite obj = new Bipartite();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
    }
}