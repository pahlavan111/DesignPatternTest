package creational.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

public class SingleTonTestRunner {

    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());


        Class c = Class.forName("creational.singletone.Singleton");
        Constructor ctr = c.getDeclaredConstructor();
        ctr.setAccessible(true);
        Singleton s3 = (Singleton) ctr.newInstance();

        System.out.println("Hashcode of Object s3:  " + s3.hashCode());

    }
}
