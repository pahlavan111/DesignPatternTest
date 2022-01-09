package reflection;

import java.lang.reflect.Method;

public class ReflectionTest {

//    Class clazz = MyMath.class;
    Class clazz = Class.forName("MyMath");
    Method[] methods = clazz.getMethods();

    public ReflectionTest() throws ClassNotFoundException {
    }
}
