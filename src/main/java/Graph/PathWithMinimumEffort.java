package Graph;/* 
  @created 31/12/22
  @author  manish.mandora
*/

import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    int MinimumEffort(int heights[][]) {

        PriorityQueue<Tuple> queue = new PriorityQueue<Tuple>((x, y) -> x.first - y.first);
        int n = heights.length;
        int m = heights[0].length;
        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = (int) 1e9;
            }
        }

        dist[0][0] = 0;
        queue.add(new Tuple(0, 0, 0));

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (queue.size() != 0) {
            int diff = queue.peek().first;
            int row = queue.peek().second;
            int col = queue.peek().third;
            queue.remove();

            if(row==n-1 && col==m-1){
                return diff;
            }

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]), diff);
                    if (newEffort < dist[nrow][ncol]) {
                        dist[nrow][ncol] = newEffort;
                        queue.add(new Tuple(newEffort, nrow, ncol));
                    }
                }
            }
        }
        return n;
    }
}
