
public class Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // Override toString to provide a meaningful representation
        @Override
        public String toString() {
            return "Node(" + data + ")";
        }
    }

    static class BinaryTree {
        static int ind = -1;

        public Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    //PRE ORDER TRAVERSAL
    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // INORDER TRAVERSAL

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);    
    }
    
    //POST ORDER
    public static void postorder(Node root){
        
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The root node is " + root);

        System.out.println("The preorder traversal is");
        preorder(root);
        System.out.println("\nthe inorder traversal is ");
        inorder(root);
        System.out.println("\nthe postorder traversal is ");
        postorder(root);
    }
}
