package Tree;

public class Test {
    public static void main(String[] args) {
        BTree tr = new BTree();
        tr.levelOrderInsert(1);
        tr.levelOrderInsert(2);
        tr.levelOrderInsert(2);
        tr.levelOrderInsert(3);
        tr.levelOrderInsert(8);
        tr.levelOrderInsert(8);
        tr.levelOrderInsert(3);

        tr.levelOrderTraversal();
        System.out.println(BTree.symmetric(tr.root,tr.root));
    }
}
