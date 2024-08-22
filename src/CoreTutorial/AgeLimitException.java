package CoreTutorial;

public class AgeLimitException extends Exception{
    private int age;
    public AgeLimitException(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
