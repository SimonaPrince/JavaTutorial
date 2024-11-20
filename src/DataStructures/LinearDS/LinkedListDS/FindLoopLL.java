package DataStructures.LinearDS.LinkedListDS;


//Code to find Loop/Cycle in the linked list , end is connected to a another node in ll
public class FindLoopLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static boolean findLoop(){
        Node slow=head;
        Node fast=head;
        while(slow != null && fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next = head;
        System.out.println("Is Loop:"+ findLoop());
    }
}
