package DataStructures.LinearDS;

import java.util.Objects;


//TODO LRU CACHE
public class LRUCache {

    static class Node{
        String key;
        int value;
        Node next;
        public Node(String key, int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }

    static Node leastUsed;

    static Node recentUsed;

    public static void putKey(String key,int value){
        Node newNode= new Node(key, value);
        if(leastUsed == null && recentUsed == null){
           leastUsed=recentUsed=newNode;
           return;
        }
        Node curr=leastUsed;
        int cache=0;
        while(curr != null){
            cache++;
            if(Objects.equals(curr.key, key)){
                curr.value = value;
                recentUsed.next=curr;
                recentUsed=curr;
            }
            else if(cache != 3){
                recentUsed.next=newNode;
                recentUsed=newNode;
            }
            else {
                leastUsed.next=leastUsed;
                recentUsed.next=newNode;
                recentUsed=newNode;
            }
            curr= curr.next;
        }
    }
    public static void getKey(String key){

        Node curr= leastUsed;
        Node prev=leastUsed;
        while(curr != null){
            if(Objects.equals(curr.key, key)){
                Node temp=recentUsed;
                recentUsed=curr;
                recentUsed.next=temp;
            }
            prev=curr;
            curr=curr.next;
        }
    }
}
