package DesignPatterns.Singleton;
//This is an example of Lazy initialization.
public class LazySingleton {

    private static LazySingleton lazySingletonInstance;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(lazySingletonInstance == null){
            return new LazySingleton();
        }
        else
            return lazySingletonInstance;
    }
}
