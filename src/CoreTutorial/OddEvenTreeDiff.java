package CoreTutorial;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenTreeDiff {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            this.val=data;
        }
        public Node(int data,Node left,Node right){
            this.val=data;
            this.left=left;
            this.right=right;
        }
    }
    public static Node root;
    public OddEvenTreeDiff(){
        root=null;
    }
    public static int difference(){
        Queue<Node> queue=new LinkedList<>();
        int oddLevel=0;
        int evenLevel=0;
        int diff=0;
        int currentLevel=0;
        int nodeInLevel=0;
        if(root == null){
            System.out.println("Tree is empty");
            return 0;

        }else{
           queue.add(root);
           currentLevel+=1;
           while(queue.size() != 0){
               nodeInLevel= queue.size();
               while(nodeInLevel>0){
                   Node current=queue.remove();
                   if(currentLevel %2 ==0){
                       evenLevel+=current.val;
                   }
                   else{
                       oddLevel+=current.val;
                   }

                   if(current.left != null){
                       queue.add(current.left);
                   }
                   if(current.right!=null){
                       queue.add(current.right);
                   }
                   nodeInLevel--;
               }
               currentLevel++;
           }
           diff=Math.abs(oddLevel-evenLevel);
        }
        return diff;
    }
    public static void main(String[]args){
        OddEvenTreeDiff bt=new OddEvenTreeDiff();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);
        System.out.println("Difference:"+difference());
    }
}
