package LinkedList;

public class DoubleLinked {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }};
   private static Node head;
   private static Node tail;
    public static void insert(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        Node prevNode=head;
        while(currNode.next != null){
            prevNode=currNode.next;
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev=prevNode;
        tail=newNode;
    }
    public static void printForward(Node head){
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+ " ");
            currNode=currNode.next;
        }
    }
    public static void printBackward(Node tail){
        while(tail != null){
            System.out.print(tail.data +" ");
            tail=tail.prev;
        }
    }
    public static void main(String[] args){
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        System.out.println("Insertion Order");
        printForward(head);
        System.out.println("Reverse");
        printBackward(tail);
    }
    }

