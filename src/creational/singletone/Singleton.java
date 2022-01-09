package creational.singletone;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("first hashCode is:  "+this.hashCode());
        if (instance!=null){
            throw new RuntimeException("can't create instance. please use getInstance() to create it") ;
        }
    }

    public static Singleton getInstance(){

        return instance;
    }

}
