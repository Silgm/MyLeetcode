package Question_406_QueueReconstructionbyHeight;

import java.util.*;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            return a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]);
        });
        for (int[] a : people) {
            System.out.print("[" + a[0] + "," + a[1] + "]" + "      ");
        }
        List<int[]> list = new LinkedList<>();
        for (int[] count : people) {
            list.add(count[1], count);
        }
        return list.toArray(new int[people.length][]);
    }
}

