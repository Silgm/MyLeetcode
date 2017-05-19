package Question_508_MostFrequentSubtreeSum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        sum(root);
        int max = 0;
        int cnt = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                cnt = 1;
            }else if (map.get(key) == max) {
                cnt++;
            }
        }
        int[] a = new int[cnt];
        int position = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                a[position++] = key;
            }
        }
        return a;
    }

    private int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left_value = sum(node.left);
        int right_value = sum(node.right);
        int sum = node.val + left_value + right_value;
        if (map.containsKey(sum)) {
            map.replace(sum, map.get(sum) + 1);
        } else {
            map.put(sum, 1);
        }
        return sum;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}