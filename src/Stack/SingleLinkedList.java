package Stack;

public class SingleLinkedList {

    static class Node{
        int data;
        Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }}

    private static Node first;
    public static void push(int data){
        Node newNode=new Node(data);
        if(first == null){
            first=newNode;
            return;
        }
        Node currentNode=first;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public static int pop(){
        int temp=0;
        if(first == null){
            System.out.println("Stack underflow");
            return -1;
        }
        Node currentNode=first;
        Node prevNode=first;
        while(currentNode.next != null){
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
         temp= currentNode.data;
         prevNode.next= null;
         return temp;
    }
    public static void printStack(Node first){
        Node currNode=first;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        push(4);
        printStack(first);
        System.out.println("Popped the element");
         System.out.println(pop());
         System.out.println("After Popping the element:");
        printStack(first);
    }

}
