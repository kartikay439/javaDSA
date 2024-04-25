package Sorting;

//import org.w3c.dom.mNode;

public class MergeSortLinked {
    class mNode
    {
        int data;
        mNode next;
        public mNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public mNode head;
    public void addLastNode(int data)
    {
        mNode newNode = new mNode(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        mNode temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=newNode;
    }
    public  void traverse()
    {
        if(head == null)
        {
            return;
        }

            mNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
        }
    }
    public mNode midNode(mNode head)
    {
        if(head==null)return null;
        if(head.next==null)
        {
            return head;
        }
        mNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public mNode mergeSort(mNode head)
    {
        if(head.next!=null && head !=null)
        {
            mNode mid = midNode(head);
            mNode head2=mid.next;
            mid.next=null;
            return  merge(mergeSort(head),mergeSort(head2));
        }
        return head;
    }
    public mNode merge(mNode head1,mNode head2)
    {
        MergeSortLinked ls = new MergeSortLinked();

        while (head1!=null && head2!=null)
        {
            if(head1.data>=head2.data)
            {
                ls.addLastNode(head2.data);
                head2=head2.next;
            }
            else
            {
                ls.addLastNode(head1.data);
                head1=head1.next;
            }
        }
        while (head1!=null)
        {
            ls.addLastNode(head1.data);
            head1=head1.next;
        }
        while (head1!=null)
        {
            ls.addLastNode(head2.data);
            head2=head2.next;
        }
        return ls.head;
    }



}
class test
{
    public static void main(String[] args) {
        MergeSortLinked ls = new MergeSortLinked();
        for (int i = 10; i >=1 ; i--) {
            ls.addLastNode(i);
        }
        System.out.println(ls.midNode(ls.head).next);
//        System.out.println(ls.head.next.data);
//        ls.traverse();
        ls.head=ls.mergeSort(ls.head);
        ls.traverse();
    }
}
