package Tree;

public class BinaryTreeNode {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left= null;
            this.right= null;
        }
        TreeNode(){}
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    private TreeNode root;
    public void insert(TreeNode node,int val){
        TreeNode newNode= new TreeNode(val);
        if(root == null){
            root=newNode;
        }

    }
}
