package CoreTutorial;

import java.util.Scanner;

public class SteadyString {
    public static int balancedString(String s) {
        int map[]=new int[128];
        char arr[]=s.toCharArray();
        int n=arr.length,k=0;
        map['Q']=map['W']=map['E']=map['R']=n/4;
        for(char i:arr){
            map[i]--;
            if(map[i]==-1) k++;
        }
        if(k==0) return 0;
        int i=0,j=0,ans=n;
        while(i<n){
            map[arr[i]]++;
            if(map[arr[i]]==0) k--;
            while(k==0){
                map[arr[j]]--;
                if(map[arr[j]]==-1) k++;
                ans=Math.min(ans,i-j+1);
                j++;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="WQWRQQQW";
        System.out.println("Length of Substring:"+balancedString(str));
    }
    }

