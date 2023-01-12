package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Paring {
    int row;
    int col;
    int time;

    public Paring(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class OrangesRotting {
    //Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<Paring> queue = new LinkedList<>();
        int countFreshOranges = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Paring(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }
                if (grid[i][j] == 1) {
                    countFreshOranges++;
                }
            }
        }

        int tm = 0;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        int count = 0;
        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
            int t = queue.peek().time;
            tm = Math.max(tm, t);
            queue.remove();
            //traverse neighbours
            for (int i = 0; i < 4; i++) {

                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0
                        && ncol < m
                        && visited[nrow][ncol] == 0
                        && grid[nrow][ncol] == 1) {
                    queue.add(new Paring(nrow, ncol, t + 1));
                    visited[nrow][ncol] = 2;
                    count++;
                }
            }
        }

        if (count != countFreshOranges)
            return -1;

        return tm;
    }

    public static void main(String args[]) {
        OrangesRotting orangesRotting = new OrangesRotting();
        int[][] grid = {{0, 1, 2}, {0, 1, 2}, {2, 1, 1}};
        int time = orangesRotting.orangesRotting(grid);
        System.out.println("minimum time := " + time);
    }
}



