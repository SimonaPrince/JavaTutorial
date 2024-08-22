package CoreTutorial;

public class BinarySearchTree {
    static class Node{
        int val;
        Node left;
        Node right;

    public Node(int val){
        this.val=val;
        left=null;
        right=null;
    }}

    public static Node root;
    public BinarySearchTree(){
        root=null;
    }
    public void insert(int val){
        Node newNode=new Node(val);
        if(root == null){
            root=newNode;
        }
        else{
            Node current=root, parent=null;
           while(true){
               parent=current;
               if(val < current.val){
                current=current.left;
                if(current == null)
                    parent.left=newNode;
               }
           }
        }
    }
}
