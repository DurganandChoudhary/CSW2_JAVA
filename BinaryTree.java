class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert a new node in the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Recursive method to insert a new node in the binary tree
    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    // Traverse the binary tree in-order (left-root-right)
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    // Test the code
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Insert nodes into the binary tree
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(4);

        // Perform in-order traversal of the binary tree
        System.out.print("In-order traversal: ");
        binaryTree.inOrderTraversal(binaryTree.root);
    }
}
