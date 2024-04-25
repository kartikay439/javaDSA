package searchTree;

import Nodes.TreeNode;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class   BSearchTree extends TreeNode {
    TreeNode root;

    public BSearchTree() {

    }

    public BSearchTree(int[] arr) {
        for (int i : arr) {
            insertNodeIterative(i);
        }
    }

    //    public void insertNode(TreeNode root,int data)
//    {
//        if(root==null)
//        {
//            TreeNode newNode=new TreeNode(data);
//            root=newNode;
//            return;
//        }
//        if(root.data<data)insertNode(root.left,data);
//        else if(root.data>data)insertNode(root.right,data);
//
//    }
    public TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            TreeNode newNode = new TreeNode(data);
            root = newNode;
            return root;
        }
        if (root.data < data) {
            root.left = insertNode(root.left, data);
        } else if (root.data > data) {
            root.right = insertNode(root.right, data);
        }
        return root;

    }

    public void insertNodeIterative(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        TreeNode pre;
        while (true) {
            pre = current;
            if (data < current.data) {
                current = current.left;
                if (current == null) {
                    pre.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    pre.right = newNode;
                    return;
                }
            }


        }

    }

    public boolean search(TreeNode root, int data) {
        TreeNode current = root;
        while (true) {
            if (current == null) {
                return false;
            } else if (current.data == data) {
                return true;
            } else if (current.data < data) {
                current = current.left;
            } else if (current.data > data) {
                current = current.right;
            }
        }

    }

    public boolean recursiveSearch(TreeNode node, int data) {
        if (node == null) return false;
        if (node.data == data) return true;
        if (node.data < data) {
            return recursiveSearch(node.left, data);
        } else if (node.data > data) {
            return recursiveSearch(node.right, data);

        }
        return false;
    }

    public void inLOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inLOrder(root.left);
        System.out.println(root.data);
        inLOrder(root.right);
    }

    public void preOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }

        }
    }

    public void inOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode current = root;
        st.push(current);
        while (!st.isEmpty()) {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            System.out.print(current.data + " ");
            current = current.right;

        }

    }

    //public void postOrderIterative()
//{
//    if(root==null)
//    return;
//    Stack<TreeNode> st = new Stack<TreeNode>();
//    st.push(root);
//    while(!st.isEmpty())
//    {
//        TreeNode current=root;
//        while (current.left!=null)
//        {
//
//            st.push(current.left);
//        }
//        System.out.println(st.pop().data);
//        while (current.right!=null)
//        {
//
//            st.push(current.right);
//
//        }
//    }
//
//}
    public  static void insertBST(int data,TreeNode root) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        TreeNode temp = root;

        while (true) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = new TreeNode(data);
                    return;
                }
                temp = temp.left;
            } else if (data > temp.data) {
                if (temp.right == null) {
                    temp.right = new TreeNode(data);
                    return;
                }
                temp = temp.right;
            }
        }
    }
    public void inOrderToArray(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) return;
        inOrderToArray(node.left, arr);
        arr.add(node.data);
        inOrderToArray(node.right, arr);

    }

    public void levelOrderTraversal() {
        if (this.root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

    }

    public boolean Path(int data, ArrayList<TreeNode> arr) {
        if (root == null) {
            return false;
        }
        TreeNode current = root;
        while (current != null) {

            if (current.data == data) {
                arr.add(current);
                return true;
            } else if (current.data < data) {
                arr.add(current);
                current = current.right;

            } else if (current.data > data) {
                arr.add(current);
                current = current.left;

            }
        }
        arr.clear();
        return false;

    }

    public Integer LeastCommonAncestor(int a, int b) {
        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        BSearchTree tr = new BSearchTree();
        Path(a, arr1);
        Path(b, arr2);
        if (arr1 == null || arr2 == null) return null;
        TreeNode lca = null;
        for (TreeNode i : arr1)
            for (TreeNode j : arr2)
                if (i.data == j.data)
                    lca = i;
        return lca.data;
    }

    public static boolean identical(BSearchTree tree1, BSearchTree tree2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrderArray(tree1.root, arr1);
        inOrderArray(tree2.root, arr2);
        return arr1.equals(arr2);

    }

    public static void inOrderArray(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) return;
        inOrderArray(node.left, arr);
        arr.add(node.data);
        inOrderArray(node.right, arr);
    }
//public boolean symmetric(TreeNode left,TreeNode right)
//{
//
//}

    public static void main(String[] args) {
BSearchTree tree=new BSearchTree();
insertBST(54,tree.root);
        System.out.println(tree.root.data);
    }

}
//class Test {
//    public static void main(String[] args) {
//        int[] leveOrderArray={25,15,50,10,22,35,70,4,12,18,24,31,44,66,90};
//        BSearchTree tr1 = new BSearchTree(leveOrderArray);
//        BSearchTree tr2 = new BSearchTree(leveOrderArray);
//        System.out.println();
//
//
////        tr.insertNodeIterative(25);
////        tr.insertNodeIterative(15);
////        tr.insertNodeIterative(50);
////        tr.insertNodeIterative(10);
////        tr.insertNodeIterative(22);
////        tr.insertNodeIterative(35);
////        tr.insertNodeIterative(70);
////        tr.insertNodeIterative(4);
////        tr.insertNodeIterative(12);
////        tr.insertNodeIterative(18);
////        tr.insertNodeIterative(24);
////        tr.insertNodeIterative(31);
////        tr.insertNodeIterative(44);
////        tr.insertNodeIterative(66);
////        tr.insertNodeIterative(90);
////tr.inLOrder(tr.root);
//ArrayList<TreeNode> arr=new ArrayList<>();
////tr.inOrderToArray(tr.root,arr);
////        System.out.println(arr.toString());
////    }
//        //        tr.levelOrderTraversal();
////        tr.Path(90,arr);
////        System.out.println(tr.LeastCommonAncestor(10,22));
//
//    }
//}
//
