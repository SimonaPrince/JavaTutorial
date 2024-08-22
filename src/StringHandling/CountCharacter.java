package StringHandling;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count = 0;
        //Total no of character (Any Character)
        System.out.println("No of Character:"+str.length());
        //Total no of Alphabetical Character
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ')
                count+=1;
        }
        System.out.println("No of Character:"+count);

        //Total no of Punctuation Marks
        String punctuation="!.'-?;";
    }
}
