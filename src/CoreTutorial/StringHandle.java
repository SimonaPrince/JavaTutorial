package CoreTutorial;

public class StringHandle {
    public static void main(String[] args){
        String input = "IINDDIIAN";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.indexOf(String.valueOf(ch)) == -1) {
                output.append(ch);
            }
        }

        System.out.println(output.toString());
    }
}
