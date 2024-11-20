package DataStructures.LinearDS.LinkedListDS;

public class DoublyLinkedList<T>{

    static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node<T> head;
    public void insert(T data){
        Node<T> newNode=new Node<>(data);
        if(this.head == null){
           this.head=newNode;
           return;
        }
        Node<T> curr=this.head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
    }

    public void print(){
        Node<T> curr=this.head;
        while(curr != null){
            System.out.println(curr.data + "->");
            curr=curr.next;
        }
    }

    public void reverse(){
        Node<T> curr=this.head;
        Node<T> prev=this.head;
    }

    public static void main(String[] args){
        DoublyLinkedList<Integer> dll=new DoublyLinkedList<>();
        dll.insert(23);
        dll.insert(45);
        dll.insert(98);
        dll.insert(35);
        dll.print();
    }
}
