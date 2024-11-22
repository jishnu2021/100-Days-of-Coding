public class BST {
    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val = val;
            left=right=null;
        }
    }

    public static boolean CheckBst(TreeNode root,Integer min, Integer max){
        if(root == null){
            return true;
        }
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }
        return CheckBst(root.left,min,root.val) && CheckBst(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right= new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        boolean result = CheckBst(root,0,0);

        if(result){
            System.out.println("Binary Search Tree");
        }else{
            System.out.println("Is not a binary Tree");
        }
    }

}
