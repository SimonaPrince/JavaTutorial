package CoreTutorial;

public class SingletonClassEx {

    private String name;

    private SingletonClassEx() {
        System.out.println("This is: Singleton Class");
    }

    private SingletonClassEx singletonClassExInstance=new SingletonClassEx();

    public SingletonClassEx getInstnace() {
        if (singletonClassExInstance == null) {
            return new SingletonClassEx();
        }
        return singletonClassExInstance;
    }

}
