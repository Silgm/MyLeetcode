package Question_515_FindLargestValueinEachTreeRow;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            if (node == null) {
                list.add(max);
                max = Integer.MIN_VALUE;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
}

