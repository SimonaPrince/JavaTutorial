package CoreTutorial;

public class MthdRefExmpl3 {
    public static void main(String[] args){
        Messageable messageable= s -> new Message(s);
        messageable.getMessage("Simona heyy");
    }
}
