package one.digitalinnovation.gof.Singleton;

public class SingletonEager {
    public static SingletonEager instance = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
