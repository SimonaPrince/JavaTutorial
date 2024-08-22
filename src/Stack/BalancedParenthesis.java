package Stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String st){
        if(st.isEmpty()){
            return true;
        }
        Stack<Character> stak=new Stack<>();
        char[] ar= st.toCharArray();
        for(int i=0; i<ar.length;i++){
            char curr=ar[i];
            if(curr == '[' || curr == '{' || curr =='('){
                stak.push(curr);
                continue;
            }
            if(stak.isEmpty()){
                return false;
            }
            char check;
                switch (curr){
                    case ')':
                        check = stak.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stak.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stak.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }

        }
        return stak.isEmpty();
    }
    public static void main(String[] args){
        String str="[()]{}{[()()]()}";
        String st1="[(])";
        if(isBalanced(st1))
            System.out.println("Parenthesis is balanced");
        else
            System.out.println("Parenthesis is  not balanced");
    }
}
