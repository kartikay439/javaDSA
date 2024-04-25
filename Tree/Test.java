package Tree;

public class Test {
    public static void main(String[] args) {
        BTree tr = new BTree();
        tr.levelOrderInsert(1);
        tr.levelOrderInsert(2);
        tr.levelOrderInsert(3);
        tr.levelOrderInsert(4);
        tr.levelOrderInsert(5);
        tr.levelOrderTraversal();
        System.out.println(tr.root.left.data);
        System.out.println(BTree.height(tr.root));
    }
}
