package Graph;/* 
  @created 24/12/22
  @author  manish.mandora
*/

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1 {
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        int[][] distance = new int[n][m];
        Queue<Node> queu = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    visited[i][j] = 1;
                    queu.add(new Node(i, j, 0));

                } else {
                    visited[i][j] = 0;
                }
            }
        }

        int delRow[] = {1, 0, -1, 0};
        int delCol[] = {0, -1, 0, 1};

        while (!queu.isEmpty()) {
            int row = queu.peek().first;
            int col = queu.peek().second;
            int dis = queu.peek().distance;
            queu.remove();
            distance[row][col] = dis;
            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && visited[nrow][ncol] == 0) {
                    visited[nrow][ncol] = 1;
                    queu.add(new Node(nrow, ncol, dis + 1));

                }
            }

        }
        return distance;
    }
}

class Node {
    int first;
    int second;
    int distance;


    public Node(int first, int second, int distance) {
        this.first = first;
        this.second = second;
        this.distance = distance;
    }
}