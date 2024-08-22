package LinkedList.LeetCode.Easy;

import java.util.Vector;

public class MiddleElements {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static Node head;

    //O(n) time complexity //O(1) space complexity
    public static int getMiddle(Node head){
        Vector<Integer> vc=new Vector<>();
        while(head != null){
            vc.add(head.data);
            head=head.next;
        }
        int midIdx=vc.size()/2;
        return vc.get(midIdx);
    }
    //Floyd's Cycle Algorithm
    //TimeComplexity O(n) and Space Complexity O(1)
    public static int getMiddle1(Node head){
     Node slowPtr=head;
     Node fastPtr=head;
     while(fastPtr != null && fastPtr.next != null){
         fastPtr=fastPtr.next.next;
         slowPtr=slowPtr.next;
     }
     return slowPtr.data;
    }
    public static void push(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
       Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public static void print(Node head){
       while(head !=null){
           System.out.print(head.data+"->");
           head= head.next;
       }
    }
    public static void main(String[] args){
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        print(head);
        System.out.println("");
       System.out.println("Middle ll emelemnt: "+getMiddle(head));
        System.out.println("Middle ll emelemnt: "+getMiddle1(head));
    }
}
