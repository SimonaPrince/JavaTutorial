package StringDS.LeetCode.Easy;

public class Operations {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equalsIgnoreCase("++x") || operations[i].equalsIgnoreCase("x++"))
                x+=1;
            else if(operations[i].equalsIgnoreCase("--x") || operations[i].equalsIgnoreCase("x--"))
                x-=1;
            else
                x=0;
        }
        return x;
    }

    public static void main(String[] args){
        String[] str={"--X","X++","X++"};
        String word="ABCDFGH";
         boolean is= word.contains("D");
        int index= word.indexOf("z");
        String sub=word.substring(0,index+1);

       System.out.println(index+":"+sub+ is);
        System.out.println(finalValueAfterOperations(str));
    }
}
