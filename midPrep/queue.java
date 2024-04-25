package midPrep;
//   CIRCULAR QUEUE
public class queue {
    int[] queue;
    int front;
    int rear;
    int capacity;
    public queue(int size)
    {
        queue=new int[size];
        front=-1;
        rear=-1;
        capacity=size;
    }
    public boolean isEmpty()
    {
        return front == -1;
    }
    public boolean isFull()
    {
        return (rear+1)%capacity==front;
    }
    public void enQueue(int data)
    {
        if(isEmpty()) {
            front = rear = 0;
            queue[front]=data;
            System.out.println("Standatrd Enqueue : "+queue[rear]);
//            System.out.println(data + "Inserted in the queue");
            return;
        }
            rear=(++rear)%capacity;
        queue[rear]=data;
        System.out.println("Standatrd Enqueue : "+queue[rear]);

//        System.out.println(data + "Inserted in the queue");
//        System.out.println(queue[rear]);



    }
    public Integer dequeue()
    {
        if(front==rear) {Integer value=queue[rear];rear=front=-1; return value;}
        if(isEmpty())return null;
        Integer value=queue[front];
        front=(++front)%capacity;
        return value;
    }
    public void insertatBegin(int data)
    {

    }
    public Integer dequeueAtEnd()
    {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        if(front==rear)
        {
            Integer value=queue[rear];
            rear=front=-1;
            return value;
        }
        return queue[rear--];
    }
    public Integer peek()
    {
        if(isEmpty()){ System.out.println("YOur circular Queue is Empty"); return null;}
        return queue[front];
    }
    void traverse()
    {
        int f= front;
        int r=rear;
        while(f != r+1)
        {
            System.out.println(queue[f]);
            f=(f+1)%capacity;
        }
    }
}
class testCircularQueue
{
    public static void main(String[] args) {
        queue q=new queue(10);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.enQueue(10);
        q.enQueue(11);
        q.traverse();
//        System.out.println("Standard Dequeue :"+q.dequeueAtEnd());
//        q.enQueue(5+1);
//        q.enQueue(5+2);
//        q.enQueue(5+3);
//        q.enQueue(5+4);
//        q.enQueue(5+5);
//        q.enQueue(5+6);
//        System.out.println("Peek : "+q.peek());;
    }
}
