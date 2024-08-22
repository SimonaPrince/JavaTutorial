package CoreTutorial;

import java.util.List;

public class ReverseString {
    public static void reverse(List<String> str, int j){
        if(str.size() == 0){
            System.out.println("Empty List");
        }
        int i=0;
        String temp=str.get(j);
        String assign=str.get(--j);
        str.set(j,assign);
        reverse(str,j);
        str.set(i,temp);
        i++;
    }
    public static void main(String[] args){
        List<String> names=List.of("Simona","Prince","Jayahsree","Mirunalini","Pooja");
        reverse(names, names.size()-1);
        names.stream().forEach(System.out::println);
    }
}
