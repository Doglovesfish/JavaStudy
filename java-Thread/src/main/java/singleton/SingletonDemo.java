package singleton;

public class SingletonDemo {
    private static volatile SingletonDemo singleton;
    private SingletonDemo(){};
    public static SingletonDemo getInstance(){
        if(singleton==null){
            synchronized(SingletonDemo.class){
                if(singleton == null){
                    singleton = new SingletonDemo();
                }
            }
        }
        return  singleton;
    }
}
