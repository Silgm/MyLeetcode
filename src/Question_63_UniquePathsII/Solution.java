package Question_63_UniquePathsII;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if((obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)||(obstacleGrid[0][0]==1)){
            return 0;
        }
        int[][] a = new int[obstacleGrid.length][obstacleGrid[0].length];
        a[0][0] = 1;
        init(a, obstacleGrid);
        createArray(a, obstacleGrid);
        return a[0][0];
    }

    private void init(int[][] a, int[][] obstacleGrid) {
        for (int i = a[0].length - 2; i > -1 && obstacleGrid[obstacleGrid.length - 1][i] != 1; i--) {
            a[a.length - 1][i] = 1;
        }
        for (int i = a.length - 2; i > -1 && obstacleGrid[i][obstacleGrid[0].length - 1] != 1; i--) {
            a[i][a[0].length - 1] = 1;
        }
    }

    private void createArray(int[][] a, int[][] obstacleGrid) {
        for (int i = a.length - 2; i > -1; i--) {
            for (int j = a[0].length - 2; j > -1; j--) {
                if (obstacleGrid[i][j] != 1) {
                    a[i][j] = a[i + 1][j] + a[i][j + 1];
                }
            }
        }
    }

}
