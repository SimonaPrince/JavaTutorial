package StringDS.LeetCode.Easy;

public class LongestCommonPrefix {

    static class Node{
        Node[] child;
        boolean eow;
        public Node(){
            child= new Node[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    static int indexs;
    public static void insert(String s){
       Node curr=root;
       for(int i=0;i<s.length();i++){
           int idx=s.charAt(i) - 'a';
           if(curr.child[idx] == null){
               curr.child[idx]=new Node();
           }
           if(i == s.length()-1){
               curr.child[idx].eow=true;
           }
           curr=curr.child[idx];
       }
    }

    public static int findChild(Node root) {
        int count = 0;
        for (int i=0; i<26; i++)
        {
            if (root.child[i] != null)
            {
                count++;
                indexs = i;
            }
        }
        return (count);
    }
    public static String prefix(Node root){
        Node curr=root;
        indexs = 0;
        String prefix = "";

        while (findChild(curr) == 1 && curr.eow == false)
        {
            curr = curr.child[indexs];
            prefix += (char)('a' + indexs);
        }
        return prefix;
    }
    public static void main(String[] args){
       String[] strs = {"a"};
     for(int i=0;i< strs.length;i++){
         insert(strs[i]);
     }
     findChild(root);
     System.out.println("Prefix is :"+ prefix(root));
    }
}
