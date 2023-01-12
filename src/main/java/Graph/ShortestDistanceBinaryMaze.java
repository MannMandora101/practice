package Graph;
/*
  @created 31/12/22
  @author  manish.mandora
*/

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceBinaryMaze {
    int shortestPath(int[][] grid, int[] source, int[] destination) {

        if (source[0] == destination[0] && source[1] == destination[1]) {
            return 0;
        }


        Queue<Tuple> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j] = (int) 1e9;
            }
        }
        int r = source[0];
        int c = source[1];
        distance[r][c] = 0;
        queue.add(new Tuple(0, r, c));
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int dis = queue.peek().first;
            int row = queue.peek().second;
            int col = queue.peek().third;
            queue.remove();

            for (int i = 0; i < 4; i++) {
                int nr = row + delrow[i];
                int nc = col + delcol[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m
                        && grid[nr][nc] == 1
                        && dis + 1 < distance[nr][nc]) {
                    distance[nr][nc] = dis + 1;
                    if (nr == destination[0] && nc == destination[1]) {
                        return dis + 1;
                    }
                    queue.add(new Tuple(1 + dis, nr, nc));
                }
            }
        }
        return -1;
    }
}

class Tuple {
    int first;
    int second;
    int third;

    public Tuple(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
