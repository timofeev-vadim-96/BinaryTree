import tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        System.out.println(tree.find(6));
        System.out.println(tree.find(5));
        System.out.println(tree.find(8));
    }
}