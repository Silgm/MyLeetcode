package Question_547_FriendCircles;

import sun.applet.Main;

import java.util.LinkedList;

public class Solution {
    public int findCircleNum(int[][] M) {
        boolean[] marked = new boolean[M.length];
        int cnt = 0;
        for (int i = 0; i < marked.length; i++) {
            LinkedList<Integer> queue = new LinkedList<>();
            if (!marked[i]) {
                queue.add(i);
                while (!queue.isEmpty()) {
                    int row = queue.removeFirst();
                    marked[row] = true;
                    for (int j = 0; j < M[row].length; j++) {
                        if (M[row][j] == 1 && !marked[j]) {
                            queue.add(j);
                        }
                    }
                }
                cnt++;
            }
        }
        return cnt;
    }

}

