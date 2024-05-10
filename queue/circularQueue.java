package queue;
public class circularQueue {
int[] queue;
int size;
int front;
int rear;
public circularQueue(int size)
{
    this.size = size;
rear=-1;
front=-1;
    queue = new int[size];
}
boolean isEmpty()
{
    return rear==-1;
}
boolean isFull()
{
    return (rear+1)%size==front;
}
void enqueue(int data)
{
    if(isFull()) {


        System.out.println("queue is full");
        return;
    }
    if(isEmpty())
    {
        rear=0;
        front=0;
    }
    else
    rear=(rear+1)%size;
    queue[rear]=data;
}
Integer dequeue()
{
    if(isEmpty())
    {
     return null;
    }
    Integer frontData=Integer.valueOf(queue[front]);
    if(front==rear)
    {
        front=-1;
        rear=-1;
    }
    else
        front=(front+1)%size;

    return frontData;
    
}
Integer peek()
{
    if(isEmpty())return null;
    return Integer.valueOf(queue[front]);
}

}
class Test
{

    public static void main(String[] args) {
        circularQueue q=new circularQueue(5);
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
//        q.enqueue(5);
//        q.enqueue(5);

        System.out.println(q.isEmpty()+" : Empty");
        System.out.println(q.isFull()+" : Full");

        
    }



}
