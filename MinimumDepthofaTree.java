
public class MinimumDepthofaTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        public int ind;  // Make 'ind' non-static

        public Node buildTree(int nodes[]) {
            if (ind >= nodes.length || nodes[ind] == -1) {
                ind++;
                return null;
            }

            Node newnode = new Node(nodes[ind]);
            ind++;
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }
    }

    public static int heightCheck(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int L = 0, R = 0;
        if (root.left != null) {
            L = heightCheck(root.left);
        }
        if (root.right != null) {
            R = heightCheck(root.right);
        }

        return 1 + Math.min(L, R);
    }

    public static void main(String[] args) {
        int nodes[] = {3, 9, 20, -1, -1, 15, 7};

        BinaryTree tree = new BinaryTree();
        tree.ind = 0;  // Initialize 'ind' to 0
        Node root = tree.buildTree(nodes);

        int height = heightCheck(root);
        System.out.println("Height of the binary tree is: " + height);
    }
}
