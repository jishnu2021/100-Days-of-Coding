

/**
 * LeetCode100
 */
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are equal.
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, they are not equal.
        if (p == null || q == null) {
            return false;
        }
        // If the values of the current nodes are not equal, they are not equal.
        if (p.val != q.val) {
            return false;
        }
        // Recursively compare the left subtrees and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
         TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Create binary tree 2:     1
        //                         /   \
        //                        2     3
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Check if the two trees are the same
        Solution solution = new Solution();
        boolean result = solution.isSameTree(p, q);

        // Print the result
        if (result) {
            System.out.println("The two binary trees are the same.");
        } else {
            System.out.println("The two binary trees are not the same.");
        }
    }
}