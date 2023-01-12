
/*
Input:
n = 3, m = 3
mat = {{5, 9, 7},
       {6, 4, 5},
       {8, 1, 2}}
ty = 0,
i = 1, j = 1
Output: 31
Explaination:
ty=0, so Avantika is the director.
ie- Mehak will move only one step in
any direction to collect the stones.
(0,1), (1,0), (1,2), (2,1), (2,2), (2,0)
are at a distance of 1 from (1,1).
Adding them 9+6+5+8+1+2=31.

 */

class Hopscotch {
    static int hopscotch(int n, int m, int mat[][], int ty, int i, int j) {
        int ans = 0;
        //y is odd
        int deltaX0Odd[] = {0, 1, 1, 1, 0, -1};
        int deltaY0Odd[] = {1, 1, 0, -1, -1, 0};
        //y is even
        int deltaX0Even[] = {-1, -1, -1, 0, 1, 0};
        int deltaY0Even[] = {0, -1, 1, -1, 0, 1};

        //unit 2 distance
        //y is evne
        int deltaX1Even[] = {-2, -2, -2, -1, -1, 0, 0, 1, 1, 1, 1, 2};
        int deltaY1Even[] = {-1, 0, 1, -2, 2, -2, 2, -2, -1, 1, 2, 0};

        //y is odd
        int deltaX1Odd[] = {-1, -1, -2, -1, -1, 0, 0, 1, 1, 2, 2, 2};
        int deltaY1Odd[] = {-2, -1, 0, 1, 2, -2, 2, -2, 2, -1, 0, 1};

        if (ty == 0) {
            //unit 1 distance
            if (j % 2 != 0) {
                for (int k = 0; k < 6; k++) {
                    int newX = deltaX0Odd[k] + i;
                    int newY = deltaY0Odd[k] + j;

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                        ans += mat[newX][newY];
                    }
                }
            } else {
                for (int k = 0; k < 6; k++) {
                    int newX = deltaX0Even[k] + i;
                    int newY = deltaY0Even[k] + j;

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                        ans += mat[newX][newY];
                    }
                }
            }
        } else {
            if (j % 2 != 0) {
                for (int k = 0; k < 12; k++) {
                    int newX = deltaX1Odd[k] + i;
                    int newY = deltaY1Odd[k] + j;

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                        ans += mat[newX][newY];
                    }
                }
            } else {
                for (int k = 0; k < 12; k++) {
                    int newX = deltaX1Even[k] + i;
                    int newY = deltaY1Even[k] + j;

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                        ans += mat[newX][newY];
                    }
                }
            }
        }

        return ans;
    }


}