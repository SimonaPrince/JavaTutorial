package DataStructures.LinearDS.StackDS;

public class StackDS {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    static  Node top;

    public static void push(int data){
        Node newNode= new Node(data);
        if(top == null){
            top =newNode;
            return;
        }
       newNode.next=top;
       top=newNode;
    }

    public static int pop(){
        if(top == null){
            System.out.println("Stack UnderFlow!!!");
        }
        Node temp=top;
        top=top.next;
        return temp.data;
    }
   public static int peek(){
        return top.data;
   }

   public static void main(String[] args){
        push(23);
        push(45);
        push(90);
        push(10);
        push(68);
        System.out.println("Top element is"+ peek());
        System.out.println("removed element"+ pop());
        System.out.println("removed element"+ pop());
       System.out.println("Top element is"+ peek());

   }
}
