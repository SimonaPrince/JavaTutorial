package TriePrefixDS;

public class Trie {
    static class Node {
        Node[] child;
        boolean eow;

        public Node() {
            child = new Node[26];
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            eow = false;
        }
    }
    static Node root= new Node();
    public static void insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx]=new Node();
            }
            if(i == s.length() -1){
                curr.child[idx].eow=true;
            }
            curr=curr.child[idx];
        }
    }

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        for(int i=0;i<strs.length;i++){
            insert(strs[i]);
        }
    }
}
