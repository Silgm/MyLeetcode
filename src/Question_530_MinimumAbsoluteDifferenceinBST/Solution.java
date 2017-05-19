package Question_530_MinimumAbsoluteDifferenceinBST;

import java.util.Map;

public class Solution {
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        runTree(root);
        return min;
    }

    private void runTree(TreeNode node) {
        if (node != null) {
            searchLeft(node, node.right);
            searchRight(node, node.left);
            runTree(node.left);
            runTree(node.right);
        }
    }

    private void searchRight(TreeNode root, TreeNode node) {
        if (node != null) {
            if (node.right == null) {
                int value = Math.abs(root.val - node.val);
                if (value < min) {
                    min = Math.abs(value);
                }
            } else {
                searchRight(root, node.right);
            }
        }
    }

    private void searchLeft(TreeNode root, TreeNode node) {
        if (node != null) {
            if (node.left == null) {
                int value = Math.abs(root.val - node.val);
                if (value < min) {
                    min = Math.abs(value);
                }
            } else {
                searchLeft(root, node.left);
            }
        }
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
