import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

    

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
    
}

    public static void Traversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val+" ");

            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("The level order traversal will be :");
        Traversal(root);
    }
}
