package Question_495_TeemoAttacking;


public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int begin = timeSeries[0], total = 0;
        for (int t : timeSeries) {
            total += t < begin + duration ? t - begin : duration;
            begin = t;
        }
        return total + duration;
    }
}

