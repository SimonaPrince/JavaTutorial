package DesignPatterns.Singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){

    }

    //No need to take care of thread safety in the given example
    private static class Impl{
        private static InnerStaticSingleton innerStaticSingletonInstance=new InnerStaticSingleton();
    }
    public static InnerStaticSingleton getInstance(){
        return Impl.innerStaticSingletonInstance;
    }
}
