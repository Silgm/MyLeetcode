package Question_526_BeautifulArrangement;

public class Solution {
    private int count=0;
    public int countArrangement(int N) {
        dfs(N, N, new boolean[N + 1]);
        return count;
    }

    private void dfs(int N, int k, boolean[] visited) {
        if (k == 0) {
            count++;
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (visited[i] || k % i != 0 && i % k != 0) {
                continue;
            }
            visited[i] = true;
            dfs(N, k - 1, visited);
            visited[i] = false;
        }
    }
}
