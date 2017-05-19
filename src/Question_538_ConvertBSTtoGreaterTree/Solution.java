package Question_538_ConvertBSTtoGreaterTree;

public class Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        sum(root);
        return root;
    }

    private void sum(TreeNode root) {
        if (root != null) {
            sum(root.right);
            root.val += sum;
            sum = root.val;
            sum(root.left);
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