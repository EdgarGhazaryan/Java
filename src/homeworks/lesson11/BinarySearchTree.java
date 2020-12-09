package homeworks.lesson11;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public void add(int value) {
        Node toAdd = new Node(value);
        Node current = root, parent = null;
        while (current != null) {
            parent = current;
            current = (value > current.value) ? current.right : current.left;
        }
        if (parent == null) {
            root = toAdd;
        } else {
            if (value > parent.value) {
                parent.right = toAdd;
            } else {
                parent.left = toAdd;
            }
        }
    }

    public void delete(int value) {
        root = deleteRecursion(root, value);
    }

    private Node deleteRecursion(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.value) {
            root.left = deleteRecursion(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRecursion(root.right, value);
        } else {
            if (!root.hasLeft()) {
                return root.right;
            } else if (!root.hasRight()) {
                return root.left;
            }
            root.value = minFromNode(root.right);
            root.right = deleteRecursion(root.right, root.value);
        }
        return root;
    }

    public boolean contains(int value) {
        return find(root, value) != null;
    }

    private Node find(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (root.value == value) {
            return root;
        }
        if (root.value < value) {
            return find(root.right, value);
        }
        return find(root.left, value);
    }

    public int max() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty");
        }
        Node current = root;
        while (current.hasRight()) {
            current = current.right;
        }
        return current.value;
    }

    public int min() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty");
        }
        return minFromNode(root);
    }

    private int minFromNode(Node root) {
        Node current = root;
        while (current.hasLeft()) {
            current = current.left;
        }
        return current.value;
    }

    public void sortedPrint() {
        sortedPrintRecursion(root);
    }

    private void sortedPrintRecursion(Node root) {
        if(root == null) {
            return;
        }

        if(root.hasLeft()) {
            sortedPrintRecursion(root.left);
        }
        System.out.print(root.value + " ");
        if(root.hasRight()) {
            sortedPrintRecursion(root.right);
        }
    }

    public void printByLevel() {
        if(root == null) {
            return;
        }

        Queue<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            Node current = deque.poll();
            System.out.print(current.value + " ");
            if(current.hasLeft()) {
                deque.offer(current.left);
            }
            if(current.hasRight()) {
                deque.offer(current.right);
            }
        }
    }
}
