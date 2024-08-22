//package Tree;
//public class SymmetricBinaryTree {
//    public boolean Solution(BinaryTreeNode root){
//        if(root== null) return true;
//        return  helper(root.left,root.right);
//    }
//    public boolean helper(BinaryTreeNode left, BinaryTreeNode right){
//        if(left == null && right == null) return true;
//        if(left == null || right == null || left.val!= right.val) return false;
//        return helper(left.left,right.right) && helper(left.right,right.left);
//    }
//    public static void main(String[] args){
//
//    }
//
//}
