package Question_48_RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int[][] copy_matrix = new int[matrix.length][matrix.length];
        for (int i = 0, x = matrix.length - 1; i < matrix.length; i++, x--) {
            for (int j = 0, y = 0; j < matrix[0].length; j++, y++) {
                copy_matrix[y][x] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = copy_matrix[i][j];
            }
        }
    }
}
