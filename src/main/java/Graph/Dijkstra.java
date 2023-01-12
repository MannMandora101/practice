package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Dijkstra {
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        int distance[] = new int[V];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);

        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[S] = 0;
        pq.add(new Pair(0, S));

        while (!pq.isEmpty()) {
            int distance1 = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (int i = 0; i < adj.get(node).size(); i++) {
                Integer edgeWeight = adj.get(node).get(i).get(1);
                Integer adjNode = adj.get(node).get(i).get(0);

                if (distance1 + edgeWeight < distance[adjNode]) {
                    distance[adjNode] = distance1 + edgeWeight;
                    pq.add(new Pair(distance[adjNode], adjNode));
                }
            }

        }
        return distance;

    }
}

class Pair {
    int node;
    int distance;

    public Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}