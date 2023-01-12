package Graph;

import java.util.ArrayList;
import java.util.HashSet;

//DFS
class CountDistinctIslands {

    int countDistinctIslands(int[][] grid) {
        int island = 0;
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        HashSet<ArrayList<String>> arrayListSet = new HashSet<ArrayList<String>>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i, j, visited, grid, list, i, j);
                    arrayListSet.add(list);
                }
            }
        }

        return arrayListSet.size();
    }

    private void dfs(int row, int col, int[][] visited, int[][] grid, ArrayList<String> list, int row0, int col0) {
        visited[row][col] = 1;
        String s = Integer.toString(row - row0);
        String ss = Integer.toString(col - col0);
        list.add((s + ss));

        int n = grid.length;
        int m = grid[0].length;

        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && visited[nrow][ncol] == 0
                    && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, visited, grid, list, row0, col0);
            }
        }


    }
}