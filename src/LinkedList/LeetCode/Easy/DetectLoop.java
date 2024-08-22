package LinkedList.LeetCode.Easy;

import java.util.HashSet;

public class DetectLoop {
    static class Node{
        int data;
        Node next;
        public  Node(int data){
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
        while(currNode.next!= null){
         currNode=   currNode.next;
        }
        currNode.next=newNode;
   }

   //O(n) Space Complexity=TimeComplexity
   public static boolean isLoop(Node head){
       HashSet<Integer> set=new HashSet<>();
       while(head != null){
           if(set.contains(head.data)){
               return true;
           }
           set.add(head.data);
           head=head.next;
       }
       return false;
   }

   //Time Complexity O(n) Space Complexity O(1)
   public static boolean isLoop1(Node head){
       Node slowPtr=head;
       Node fastPtr=head;
       boolean flag=false;
       while(slowPtr != null && fastPtr != null && fastPtr.next != null){
           slowPtr=slowPtr.next;
           fastPtr=fastPtr.next.next;
           if(slowPtr ==fastPtr){
               flag=true;
               break;
           }
       }
       return flag;
   }

   public static boolean isLoop2(Node head){
       Node temp=new Node(0);
       while(head != null){
           if(head.next == null){
               return false;
           }
           if(head.next == temp){
               return true;
           }
           Node next=head.next;
           head.next=temp;
           head=next;
       }
       return false;
   }
   public static void main(String[] args){
      push(20);
      push(4);
      push(15);
      push(10);

       /*Create loop for testing */
//       head.next.next.next.next = head;

       if (isLoop1(head))
           System.out.println("Loop Found");
       else
           System.out.println("No Loop");
   }

}
