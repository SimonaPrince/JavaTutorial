package CoreTutorial;

import java.util.LinkedList;
import java.util.Queue;

public class TreeQ1 {
    public int diffOddEven(TreeNode root){
        int odd=0,even=0,diff=0;
        int currentLevel=0,nodeinLevel=0;
        Queue<TreeNode> queue= new LinkedList<>();
        if(root == null){
            System.out.println("Tree is Empty");
            return 0;
        }
        else{
            queue.add(root);
            currentLevel+=1;
            while(queue.size() != 0){

            }
    }
        return odd;
    }
}
