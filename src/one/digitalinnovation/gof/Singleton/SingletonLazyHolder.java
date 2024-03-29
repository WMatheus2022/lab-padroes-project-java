package one.digitalinnovation.gof.Singleton;

public class SingletonLazyHolder {
    private static class instanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return instanceHolder.instancia;
    }
}
