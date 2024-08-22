package CoreTutorial;

public class QueueClass {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            next=null;
        }
    }
    static class Queue{
        static Node front=null;

        static Node rear=null;
        public static boolean isEmpty(){
            return front == null && rear == null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                rear=front=newNode;
            }
            rear.next=newNode;
            rear=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            else {
                int head=front.val;
                if(front == rear)
                    rear=null;
                front=front.next;
                return head;
            }
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            else {
                return front.val;
            }
        }
    }

    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
