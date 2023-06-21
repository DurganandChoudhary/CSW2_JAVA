class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class IsBST {
    private Node prev; // Track previous node during inorder traversal

    public boolean isBST(Node root) {
        prev = null; // Initialize prev to null
        return isBSTUtil(root);
    }

    private boolean isBSTUtil(Node node) {
        if (node == null)
            return true;

        // Check if the left subtree is BST
        if (!isBSTUtil(node.left))
            return false;

        // Check if the current node is greater than the previous node
        if (prev != null && node.data <= prev.data)
            return false;

        prev = node; // Update prev

        // Check if the right subtree is BST
        return isBSTUtil(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        IsBST bst = new IsBST();
        boolean isBST = bst.isBST(root);
        if (isBST)
            System.out.println("The binary tree is a Binary Search Tree.");
        else
            System.out.println("The binary tree is not a Binary Search Tree.");
    }
}
