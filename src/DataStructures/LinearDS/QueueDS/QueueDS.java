package DataStructures.LinearDS.QueueDS;

public class QueueDS<T>{

    static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data){
            this.data=data;
            this.next=null;
        }
    }

    Node<T> front;
    Node<T> rear;
    public void enQueue(T data){
        Node<T> newnode= new Node<>(data);
        if(front == null && rear == null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public void deQueue(){
        if(front == null && rear== null){
            System.out.println("Queue Underflow!!!");
            return;
        }
        if(front == null){
            rear=null;
            return;
        }
        front = front.next;
    }

    public void getRearFront(){
        if(front == null || rear == null){
            System.out.println("Queue Empty!!!");
        }
        System.out.println("Front: "+ front.data + "Rear: "+rear.data);
    }
    public static void main(String[] args){
        QueueDS<Integer> q= new QueueDS<>();
        q.enQueue(23);
        q.enQueue(43);
        q.enQueue(63);
        q.getRearFront();
        q.enQueue(83);
        q.enQueue(93);
        q.getRearFront();
        q.deQueue();
        q.getRearFront();
        q.enQueue(45);
        q.getRearFront();
    }
}
