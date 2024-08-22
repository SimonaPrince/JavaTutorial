package CoreTutorial;

public class LinkedListReverse {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static Node head;
    public static void push(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public static void print(){
        Node currNode=head;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void reverse(){
        Node prevNode=null;
        Node currNode=head;
        Node nextNode=null;
        while(currNode != null){
           nextNode=currNode.next;

        }

    }

    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        push(4);
        print();
        System.out.println("Reverse List:");
        reverse();
        print();
    }
}
