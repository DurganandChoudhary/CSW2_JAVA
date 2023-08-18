package Binary_Tree;

public class BinaryTree {
    private Node root;

    public void InsertNode(int value) {
        root = InsertNode(root, value);
    }

    private Node InsertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else {
            if (node.value > value) {
                node.lChild = InsertNode(node.lChild, value);
            } else {
                node.rChild = InsertNode(node.rChild, value);
            }
        }
        return node;
    }

    public boolean Find(int value) {
        Node curr = root;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            } else if (curr.value > value) {
                curr = curr.lChild;
            } else {
                curr = curr.rChild;
            }
        }
        return false;
    }

    public int FindMin() {
        Node node = root;
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        while (node.lChild != null) {
            node = node.lChild;
        }
        return node.value;
    }

    public Node FindMinNode(Node curr) {
        Node node = curr;
        if (node == null) {
            return null;
        }
        while (node.lChild != null) {
            node = node.lChild;
        }
        return node;
    }

    public Node FindMaxNode(Node curr) {
        Node node = curr;
        if (node == null) {
            return null;
        }
        while (node.rChild != null) {
            node = node.rChild;
        }
        return node;
    }

    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.value) {
            node.lChild = deleteNode(node.lChild, value);
        } else if (value > node.value) {
            node.rChild = deleteNode(node.rChild, value);
        } else {
            if (node.lChild == null && node.rChild == null) {
                node = null;
            } else if (node.lChild == null) {
                node = node.rChild;
            } else if (node.rChild == null) {
                node = node.lChild;
            } else {
                Node minNode = FindMinNode(node.rChild);
                node.value = minNode.value;
                node.rChild = deleteNode(node.rChild, minNode.value);
            }
        }

        return node;
    }
    public boolean isBST3(Node root) {
        if (root == null)
            return true;
        if (root.lChild != null && FindMaxNode(root.lChild).value > root.value)
            return false;
        if (root.rChild != null && FindMinNode(root.rChild).value <= root.value)
            return false;
        return (isBST3(root.lChild) && isBST3(root.rChild));
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.InsertNode(4);
        binaryTree.InsertNode(2);
        binaryTree.InsertNode(1);
        binaryTree.InsertNode(3);
        binaryTree.InsertNode(6);
        binaryTree.InsertNode(5);
        binaryTree.InsertNode(7);

        System.out.println("Binary Tree Created Successfully!");

        int searchValue = 3;
        boolean isFound = binaryTree.Find(searchValue);
        System.out.println("Search for value " + searchValue + ": " + isFound);

        int minValue = binaryTree.FindMin();
        System.out.println("Minimum value in the tree: " + minValue);

        Node minNode = binaryTree.FindMinNode(binaryTree.root);
        System.out.println("Minimum node in the tree: " + minNode.value);

        Node maxNode = binaryTree.FindMaxNode(binaryTree.root);
        System.out.println("Maximum node in the tree: " + maxNode.value);

        boolean isBST = binaryTree.isBST3(binaryTree.root);
        System.out.println("Is the tree a Binary Search Tree? " + isBST);
        
        int deleteValue = 2;
        binaryTree.deleteNode(deleteValue);
        System.out.println("Node " + deleteValue + " deleted from the tree.");
    }
}

class Node {
    int value;
    Node lChild;
    Node rChild;

    public Node(int value) {
        this.value = value;
        this.lChild = null;
        this.rChild = null;
    }
}
