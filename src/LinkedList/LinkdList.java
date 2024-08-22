package LinkedList;

public class LinkdList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    };
    public static Node head;
    public static void insert(int data){
        Node newNode=new Node(data);
        if(head== null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!= null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        return;
    }
    public static void main(String[] args){
        insert(3);
        insert(4);
        insert(5);
    }
}
