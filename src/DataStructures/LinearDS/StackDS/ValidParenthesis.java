package DataStructures.LinearDS.StackDS;


import java.util.Stack;

public class ValidParenthesis {

    public static boolean isPar(String str){
        Stack<Character> st= new Stack<Character>();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ){
                st.push(str.charAt(i));
            } else{
                if(!st.empty() && (st.peek() == '{' && str.charAt(i) == '}')||(st.peek() == '[' && str.charAt(i) == ']')||(st.peek() == '(' && str.charAt(i) == ')')){
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args){
       String str="{()}[]";
       System.out.println("Is Balanced Parenthesis:" + isPar(str));
    }
}
