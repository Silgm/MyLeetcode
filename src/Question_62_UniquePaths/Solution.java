package Question_62_UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] a = new int[m][n];
        init(a);
        createArray(a);
        return a[0][0];
    }

    private void createArray(int[][] a) {
        for (int i = a.length - 2; i > -1; i--) {
            for (int j = a[0].length - 2; j > -1; j--) {
                a[i][j] = a[i + 1][j] + a[i][j + 1];
            }
        }
    }

    private void init(int[][] a) {
        for (int i = 0; i < a[0].length - 1; i++) {
            a[a.length - 1][i] = 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            a[i][a[0].length - 1] = 1;
        }
    }

}
