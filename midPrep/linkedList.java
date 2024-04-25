package midPrep;

public class linkedList {
    private class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
//            prev=next=null;
        }

    }
    private Node head,tail;
    public void addFirst(int data)
    {
     if(head==null)
     {
         head=tail=new Node(data);
     }
     else
     {
         Node newNode=new Node(data);
         newNode.next=head;
         head.prev=newNode;
         head=newNode;

     }
    }

    public void iterate()
    {
        Node temp=head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}
class test
{
 static linkedList ls= new linkedList();

    public static void main(String[] args) {
        ls.addFirst(10);
        ls.addFirst(12);
        ls.addFirst(13);
        ls.addFirst(14);
        ls.addFirst(15);
        ls.addFirst(16);
        ls.addFirst(17);
        ls.iterate();

    }
}
