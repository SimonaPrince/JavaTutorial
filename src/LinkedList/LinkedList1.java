package LinkedList;

public class LinkedList1 {

    static class Node{
        String data;
        Node next;
    public  Node(String data){
        this.data=data;
        this.next=null;
    }}

    private static Node head;

    public static void add(String data){
        Node newNode=new Node(data);
        if(head == null){
            head =newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }

    public static void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head =newNode;
        }
        Node currentNode=head;
        while(currentNode.next!= null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    public static void print(Node head){
        Node currentNode=head;
        while(currentNode!= null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    public static void deleteFirst(Node head){
        if(head == null){
            System.out.print("List is empty");
        }
         head=head.next;
    }
    public static void deleteLast(Node head){
        if(head == null){
            System.out.print("List is empty");
        }
        if(head.next == null){
            head = head.next;
        }
        Node secondLast=head;
        Node last =head.next;
        while(last.next != null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args){
        LinkedList1 l=new LinkedList1();
        add("This");
        add("is");
        add("a");
        addLast("List");
        print(head);
        deleteLast(head);
        print(head);
    }

}
