package DesignPatterns.Singleton;

public class LazySingleThreadSafe {
    private static LazySingleThreadSafe lazySingleThreadSafeInstance;
    private LazySingleThreadSafe(){

    }
    //Leads to out code optimization problems
  /*
    public static synchronized LazySingleThreadSafe getInstance(){
        if(lazySingleThreadSafeInstance == null){
            return new LazySingleThreadSafe();
        }
        else
            return lazySingleThreadSafeInstance;
    }
    */
    //double checked Locking

    public static LazySingleThreadSafe getInstance(){
       if(lazySingleThreadSafeInstance == null){
           synchronized (LazySingleThreadSafe.class){
               if(lazySingleThreadSafeInstance == null){
                   return new LazySingleThreadSafe();
               }
           }
       }
        return lazySingleThreadSafeInstance;
    }
}
