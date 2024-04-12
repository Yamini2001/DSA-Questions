class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right=null;
    }
    public static class BinaryTree {
        public Node root;

        public void reverseOrder(Node root) {
            int h = height(root);
            for (int i = h; i >= 1; i--) {
                printGiveNode(root, i);
            }
        }

        public void printGiveNode(Node root, int level) {
            if (root == null) {
                return;
            }
            if (level == 1) {
                System.out.println(root.data + " ");
            } else if (level > 1) {
                printGiveNode(root.left, level - 1);
                printGiveNode(root.right, level - 1);
            }
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int LeftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (LeftHeight > rightHeight) {
                return (LeftHeight + 1);
            } else {
                return (rightHeight + 1);
            }
        }
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level Order traversal of binary tree is : ");
        tree.reverseOrder(tree.root);
    }
}