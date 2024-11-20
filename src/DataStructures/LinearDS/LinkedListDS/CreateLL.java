package DataStructures.LinearDS.LinkedListDS;

public class CreateLL {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static void insertAtLast(int data){
        Node newNode= new Node(data);
        if(head == null){
           head=newNode;
           return;
        }
        Node curr=head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public static void insertAtGiven(int data, int key){
        Node newNode=new Node(data);
        Node curr=head;
        while(curr != null){
            if(curr.data == key){
                Node temp=curr.next;
                curr.next=newNode;
                newNode.next=temp;
                return;
            }
            curr= curr.next;
        }
    }
    public static void insertBeforeGiven(int data, int key){
        Node newNode=new Node(data);
        Node curr=head;
        Node prev=head;
        while(curr != null){
          if(curr.data == key){
              prev.next=newNode;
              newNode.next=curr;
              return;
          }
          prev=curr;
          curr=curr.next;
        }
    }

    public static void deleteAtEnd(){
        Node curr=head;
        Node prev=head;
        while(curr.next != null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }
    public static void print(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
    }

    public static void deleteGivenNode(int key){
        Node curr=head;
        Node prev=head;
        while(curr != null){
            if(curr.data == key){
              prev.next=curr.next;
              return;
            }
            prev=curr;
            curr=curr.next;
        }
    }

    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next=head;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }
    public static void main(String[] args){
         insertAtLast(21);
         insertAtLast(32);
         insertAtLast(65);
         print();
         insertAtGiven(45,32);
         System.out.println();
         print();
        insertBeforeGiven(89,45);
        System.out.println();
        print();
//        deleteAtEnd();
//        deleteGivenNode(89);
        reverse();
        System.out.println();
        print();
    }
}
