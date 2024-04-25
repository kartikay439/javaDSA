package midPrep;

public class STACK {

        int[] stack;
        int TOP;
        int capacity;
        public STACK(int size)
        {
            stack=new int[size];
            TOP=-1;
            capacity=size;
        }
        public boolean isEmpty()
        {
            return TOP == -1;
        }
        public boolean isFull()
        {
            return TOP == capacity-1;
        }
        public void push(int data)
        {
            if (isFull()) {
                return;
            }
            stack[++TOP]=data;
        }
        public Integer peek()
        {
            if(isEmpty()) {System.out.println("Stack is empty"); return null;}
            return stack[TOP];
        }

}
class teststack{
    public static void main(String[] args) {
        STACK st = new STACK(10);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(101);
        st.push(102);

        System.out.println(st.peek());
        System.out.println(st.isFull());

    }
}
