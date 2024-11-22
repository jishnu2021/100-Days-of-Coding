public class LowestCommonAncester {

    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val = val;
            left=right=null;
        }
    }

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null or if we find either of the nodes (p or q)
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        // If both left and right are non-null, it means p and q are on different sides
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null node (either left or right)
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;  // Node with value 5
        TreeNode q = root.left.right.right;  // Node with value 4

        TreeNode lca = findLCA(root, p, q);
        if (lca != null) {
            System.out.println("LCA of " + p.val + " and " + q.val + " is " + lca.val);
        } else {
            System.out.println("LCA not found.");
        }
    }
}
