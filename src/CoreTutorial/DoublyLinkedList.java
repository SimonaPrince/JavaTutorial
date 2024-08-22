package CoreTutorial;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
    };
    static Node head_ref;
    public static void push(int new_data){
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.next=head_ref;
        new_node.prev=null;
        if(head_ref != null){
            head_ref.prev=new_node;
        }
        head_ref=new_node;
    }
    public static void print(Node n){
        Node last=null;
        while(n!= null){
            System.out.print(" "+n.data+" ");
            last=n;
            n=n.next;
        }
    }
    public static void main(String[] args){
        head_ref=null;
        push(5);
        push(6);
        push(7);
        push(8);
        print(head_ref);
    }
}
