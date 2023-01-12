package Graph;

import java.util.LinkedList;
import java.util.Queue;

class NumIslands {
    // Function to find the number of islands.
    //n*m
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int island = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (visited[row][col] == 0 && grid[row][col] == '1') {
                    island++;
                    bfs(row, col, visited, grid);
                }
            }
        }
        return island;
    }

    private void bfs(int ro, int co, int[][] visited, char[][] grid) {
        visited[ro][co] = 1;
        Queue<Pairs> queue = new LinkedList<>();
        queue.add(new Pairs(ro, co));

        while (!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();

            //traverse neighbours
            for (int delrow = -1; delrow <= 1; delrow++) {
                for (int delcol = -1; delcol <= 1; delcol++) {
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    if (grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                        visited[nrow][ncol] = 1;
                        queue.add(new Pairs(nrow, ncol));
                    }
                }
            }
        }
    }
}

class Pairs {
    int first;
    int second;

    public Pairs(int first, int second) {
        this.first = first;
        this.second = second;
    }
}