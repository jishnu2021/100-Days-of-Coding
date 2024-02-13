import java.util.LinkedList;
import java.util.Queue;

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

public class treeprob {
    public static void main(String[] args) {
        // Creating a binary tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(findsucc(root, 15));
        
    

    }

    public static TreeNode findsucc(TreeNode root,int key){
        if (root == null){
            return null;
    }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
           
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null)
                    queue.offer(currentNode.left);

                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            if(currentNode.val == key){
                break;
            }
        }

        return queue.peek();
    }
}
