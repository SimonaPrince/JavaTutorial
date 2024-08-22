package CoreTutorial;

public class LinkedList2 {

    static class Node{
        int val;
        Node next;

        Node(int data){
            this.val=data;
            this.next=null;
        }
    };
    private static Node head;
    public static void addLast(int val){
       Node newNode=new Node(val);
        if(head == null){
            head =newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!= null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    public static void reverse(){
        if(head== null || head.next == null){
            System.out.println("List is Empty");
            return;
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode != null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;

            prevNode=currentNode;
            currentNode=nextNode;
        }
            head.next=null;
            head=prevNode;

    }
    public static void print(){
      Node currentNode=head;
        while(currentNode!= null){
            System.out.print(currentNode.val+"->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        print();
        System.out.println(" ");
        reverse();
        print();
    }
}
