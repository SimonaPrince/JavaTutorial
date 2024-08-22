package CoreTutorial;

public class StackClass {

  static class Node{
      int val;
      Node next;
  public  Node(int val){
      this.val=val;
      next=null;
  }}

    static class Stack{
      public static Node top;
        public static boolean isEmpty(){
            return  top == null;
        }
        public static void pushAtBottom(int data, Stack s){
            if(isEmpty()){
                s.push(data);}
            int val= s.pop();
            pushAtBottom(data,s);
            push(val);

        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                top=newNode;
            }
            else{
            newNode.next=top;
            top=newNode;}
        }

        public static int pop(){
            if(isEmpty())
                return -1;
            else{
                int val= top.val;
                top=top.next;
                return val;
            }
        }
        public static int peek(){
            if(isEmpty())
                return -1;
            else{
                return top.val;
            }
        }
    }

  public static void main(String[] args){
     Stack s=new Stack();
     
     s.push(1);
     s.push(2);
     s.push(4);
     s.push(6);
     s.pushAtBottom(5,s);
     while(!s.isEmpty()){
         System.out.println(s.peek());
         s.pop();
      }
  }
}
