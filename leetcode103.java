import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class leetcode103 {
    public static void main(String[] args) {
        // Creating a binary tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calling the method to compute the zigzag level order traversal
        List<List<Integer>> zigzagOrder = zigzagLevelOrder(root);

        // Printing the zigzag level order traversal
        for (List<Integer> level : zigzagOrder) {
            System.out.println(level);
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode;
                if (!reverse) {
                    currentNode = queue.pollFirst();
                    if (currentNode != null) {
                        levelNodes.add(currentNode.val);
                        if (currentNode.left != null)
                            queue.offerLast(currentNode.left);
                        if (currentNode.right != null)
                            queue.offerLast(currentNode.right);
                    }
                } else {
                    currentNode = queue.pollLast();
                    if (currentNode != null) {
                        levelNodes.add(currentNode.val);
                        if (currentNode.right != null)
                            queue.offerFirst(currentNode.right);
                        if (currentNode.left != null)
                            queue.offerFirst(currentNode.left);
                    }
                }
            }

            reverse = !reverse;
            result.add(levelNodes);
        }

        return result;
    }
}
