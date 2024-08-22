package CoreTutorial;

public class MthdRefExmpl1 {
    public  String saySom(String name){
        return name;
    }
    public static String Say(String name){return  name;}
    public static void main(String[] args){
        //calling instance methods we need to create objects and call the method
        Sayable s=new MthdRefExmpl1()::saySom;
        String name="Simona";
        System.out.println(s.say(name));
        //calling static method we can directly call the method with the clss name
        Sayable s2=MthdRefExmpl1::Say;
        System.out.println(s.say(name));
    }
}
