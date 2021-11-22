package self_test;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
public class demo {
    public static void main(String[] args)throws Exception {
        Refliction_test test = new Refliction_test();
//        Class cls=test.getClass();
//        System.out.println("obj class name is "+cls.getName());
//        Constructor constructor = cls.getConstructor();
//        System.out.println("constructor class name is "+constructor.getName());
//        System.out.println("names of public methods: ");
//        Method[] methods = cls.getMethods();
//        for(Method method:methods)
//            System.out.println(method.getName());
//        Field field=cls.getDeclaredField("five");
//        field.setAccessible(true);
//        field.set(test,5);
//        Method method = cls.getDeclaredMethod("fuck", int.class);
//        method.setAccessible(true);
//        method.invoke(test,5);
//        Method method1 =cls.getDeclaredMethod("print");
//        method1.invoke(test);
        Class test1 = test.getClass();
       Refliction_test rt=(Refliction_test) test1.newInstance();
       rt.print();

    }
}
