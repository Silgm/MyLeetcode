package Question_513_FindBottomLeftTreeValue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {

        val = x;
    }
}

public class Solution {
    public int findBottomLeftValue(TreeNode root) {

        return findBottomLeftValue(root, 1, new int[]{0, 0});
    }

    private int findBottomLeftValue(TreeNode node, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = node.val;
            res[1] = depth;
        }
        if (node.left != null) {
            findBottomLeftValue(node.left, depth + 1, res);
        }
        if (node.right != null) {
            findBottomLeftValue(node.right, depth + 1, res);
        }
        return res[0];
    }
}