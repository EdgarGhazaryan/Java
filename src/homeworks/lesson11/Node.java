package homeworks.lesson11;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public boolean hasBoth() {
        return left != null && right != null;
    }
}
