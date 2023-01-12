package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pairs1 {
    int first;
    int second;

    public Pairs1(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class NumberOfEnclaves {

    int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        Queue<Pairs1> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    if (grid[i][j] == 1) {
                        visited[i][j] = 1;
                        queue.add(new Pairs1(i, j));
                    }
                }
            }
        }


        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && visited[nrow][ncol] == 0 && grid[nrow][ncol]==1) {
                    visited[nrow][ncol] = 1;
                    queue.add(new Pairs1(nrow, ncol));
                }
            }
        }

        int noOfEnclave=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<m ;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    noOfEnclave++;
                }
            }
        }
        return noOfEnclave;
    }
}