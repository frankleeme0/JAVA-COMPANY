package ClassLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class VarReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("ClassLoader.Student1");

//        Field[] declaredFields = aClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        Field name = aClass.getField("name");
        Student1 student1=(Student1) aClass.newInstance();
        name.set(student1,"zhangsan");
        System.out.println(student1);
        Object o = name.get(student1);
        System.out.println(o);

        Field money = aClass.getDeclaredField("money");
        money.setAccessible(true);
        money.set(student1,200);



    }
}
