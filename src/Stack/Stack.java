package Stack;

//
public class Stack<T>{
      class Node{
            T data;
            Node prev;
            Node next;
            public Node( T data){
                this.data=data;
                this.prev=null;
                this.next=null;
            }
        }
        private Node first;
        private Node last;
        void push(T data){
            Node newNode=new Node(data);
            if(first == null){
                first=last=newNode;
                return;
            }
            else{
                last.next=newNode;
                newNode.prev=last;
                last=newNode;
            }
        }
        public T pop(){
            Node currNode=last;
            if(last != null){
                last=last.prev;
            }else{
                throw new RuntimeException();
            }
            return currNode.data;
        }
        public T peek(){
            return last.data;
        }
        public static void main(String[] args){
            Stack<Integer> st= new Stack<Integer>();
            st.push(1);
            st.push(2);
            st.push(3);
            System.out.println("Remove element:"+ st.pop());
            System.out.println("Peek into element:"+st.peek());
            st.checKStack();
        }
        public void checKStack(){
            Stack<String> st= new Stack<String>();
            st.push("Simona");
            st.push("Prince");
            assert st.pop().equals(st.last.data);
        }

    }

