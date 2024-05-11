package Tree;

import java.util.LinkedList;
import java.util.Queue;

import static javax.swing.Spring.height;

//BINARY SEARCH TREE
public class BTree extends TreeNode {

    TreeNode root;

    //DEPTH OF TREE
    public int depth(TreeNode root)
    {
        if(root==null)return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }

    //LEVEL ORDER INSERTION IN BINARY SEARCH TREE
    public void levelOrderInsert(int data) {
        TreeNode newNode = new TreeNode(data);
        if(root==null){
            this.root=newNode;
            return;
        }

        Queue<TreeNode> queue= new LinkedList<>();
        //here offer refers to enqueue and poll refers to dequeue
        queue.offer(this.root);//add items

        while(true){
            TreeNode temp= queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }else{
                temp.left=newNode;
                break;
            }

            if(temp.right!=null){
                queue.offer(temp.right);
            }else{
                temp.right=newNode;
                break;
            }
        }
    }

    //BINARY INSERTION
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

//LEVEL ORDER TRAVERSAL
    public void levelOrderTraversal() {
        if(this.root==null){
            return;
        }

        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(this.root);

        while(!queue.isEmpty()){
            TreeNode temp= queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }

    }

    //PREORDER TRAVERSAL OF ANY TREE
    public void preOrder(TreeNode node){
        if(node != null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //INORDER TRAVERSAL OF ANY TREE
    public void inOrder(TreeNode node){
        if(node != null){

            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    //POSTORDER TRAVERSAL OF ANY TREE
    public void postOrder(TreeNode node){
        if(node != null){

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }


//    public static int height(TreeNode node){
//        if(node == null){
//            return 0;
//        }
////        return Math.max(0,0) +1;  //+1 for the root node existence
//        return Math.max(height(node.left),height(node.right)) +1;
//    }


    //COUNTING TOTAL NUMBER OF NODES IN A TREE
    public static int countNode(TreeNode node){
        if (node==null){
            return 0;
        }

        return (countNode(node.left)+countNode(node.right)+1);
    }

    //COUNTING ONLY LEAF NODE IN ANY KIND OF TREE
    public static int countLeafNodes(TreeNode node){
        if (node==null){
            return 0;
        }

        if(node.left == null && node.right ==null){
            return 1;
        }

        return (countLeafNodes(node.left)+countLeafNodes(node.right));
    }

    //FINDING SUM OF LEAF NODES IN A TREE
    public static int sumLeafNodes(TreeNode node){
        if (node==null){
            return 0;
        }

        if(node.left == null && node.right ==null){
            return node.data;
        }

        return (sumLeafNodes(node.left)+sumLeafNodes(node.right));
    }


    //FINDING SUM OF ALL NODES IN ANY KIND OF TREE
    public static int sumNodes(TreeNode node){
        if (node==null){
            return 0;
        }

        return (sumNodes(node.left)+sumNodes(node.right)+node.data);
    }

    //CHECKING WHETHER TREE IS BALANCED OR NOT
    public  boolean isBalance(TreeNode root){
        if(root==null){
            return true;
        }
        int lh=depth(root.left);
        int rh=depth(root.right);

        if(Math.abs(lh-rh)>1){
            return false;
        }

        return isBalance(root.left) && isBalance(root.right);

    }


    //SERCHING IN ANY TREE
    public static boolean search(TreeNode node, int value){
        if(node==null){
            return true;
        }

        if(node.data==value){
            return true;
        }

        return search(node.left, value) || search(node.right, value);

    }

    //WHETHER THE TREE IS SYMMETRIC OR NOT.
    public   boolean symmetric(TreeNode node1,TreeNode node2)
    {
        if(node1==null && node2==null )return  true;
        if(node1!=null && node2!=null && node1.data==node2.data )
        {
            return symmetric(node1.right,node2.left) && symmetric(node1.left,node2.right);
        }
        return false;

    }
}