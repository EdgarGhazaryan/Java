package homeworks.lesson11;

public class Test {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(100);
        tree.add(150);
        tree.add(70);
        tree.add(80);
        tree.add(20);
        tree.add(10);

        System.out.println(tree.contains(20));
        tree.delete(20);
        System.out.println(tree.contains(20));

        System.out.println("Printing in sorted order");
        tree.sortedPrint();
        System.out.println("\nPrinting by level");
        tree.printByLevel();

        System.out.println("\nMax element is " + tree.max());
        System.out.println("Min element is " + tree.min());
    }
}
