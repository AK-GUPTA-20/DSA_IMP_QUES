class BinaryTree {
    int[] tree;
    int capacity;

    BinaryTree(int size) {
        capacity = size;
        tree = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            tree[i] = -1; // Initialize with -1 to indicate empty nodes
        }
    }

    void setRoot(int key) {
        tree[0] = key;
    }

    void setLeft(int parentIndex, int key) {
        int leftIndex = (2 * parentIndex) + 1;
        if (leftIndex < capacity) {
            tree[leftIndex] = key;
        }
    }

    void setRight(int parentIndex, int key) {
        int rightIndex = (2 * parentIndex) + 2;
        if (rightIndex < capacity) {
            tree[rightIndex] = key;
        }
    }

    void display() {
        for (int value : tree) {
            if (value != -1) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }


    // In-Order Traversal (Left - Root - Right)
    void inOrderTraversal(int index) {
        if (index >= capacity || tree[index] == -1) return;

        inOrderTraversal(2 * index + 1);
        System.out.print(tree[index] + " ");
        inOrderTraversal(2 * index + 2);
    }

    // Pre-Order Traversal (Root - Left - Right)
    void preOrderTraversal(int index) {
        if (index >= capacity || tree[index] == -1) return;

        System.out.print(tree[index] + " ");
        preOrderTraversal(2 * index + 1);
        preOrderTraversal(2 * index + 2);
    }

    // Post-Order Traversal (Left - Right - Root)
    void postOrderTraversal(int index) {
        if (index >= capacity || tree[index] == -1) return;

        postOrderTraversal(2 * index + 1);
        postOrderTraversal(2 * index + 2);
        System.out.print(tree[index] + " ");
    }
}

public class BinaryTreeArray {
    public static void main(String[] args) {
        BinaryTree treeArr = new BinaryTree(10);
        treeArr.setRoot(1);
        treeArr.setLeft(0, 2);
        treeArr.setRight(0, 3);
        treeArr.setLeft(1, 4);
        treeArr.setRight(1, 5);

        System.out.print("Binary Tree using Array: ");
        treeArr.display();

        System.out.print("In-order traversal: ");
        treeArr.inOrderTraversal(0);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        treeArr.preOrderTraversal(0);
        System.out.println();

        System.out.print("Post-order traversal: ");
        treeArr.postOrderTraversal(0);
        System.out.println();
    }
}
