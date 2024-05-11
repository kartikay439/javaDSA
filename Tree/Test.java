package Tree;

public class Test {
    public static void main(String[] args) {
        BTree tr = new BTree();
        tr.levelOrderInsert(1);
        tr.levelOrderInsert(2);
        tr.levelOrderInsert(2);
//        tr.levelOrderInsert(3);
//        tr.levelOrderInsert(8);
//        tr.levelOrderInsert(1);
//        tr.levelOrderInsert(3);
//        tr.levelOrderInsert(3);
//        tr.levelOrderInsert(3);
//        tr.levelOrderInsert(15);
//        tr.levelOrderInsert(16);
//        tr.levelOrderInsert(17);
//        tr.levelOrderInsert(18);
//        tr.levelOrderInsert(19);

        tr.levelOrderTraversal();
        System.out.println("IS SYMMETRIC : "+tr.symmetric(tr.root,tr.root));
        System.out.println(tr.depth(tr.root));
        System.out.println(tr.isBalance(tr.root));
    }
}
