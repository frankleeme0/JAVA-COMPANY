package ClassLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("ClassLoader.Student");
        //获取公共构造方法
//        Constructor<?>[] constructors = clazz.getConstructors();
//        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//        Constructor<?> constructor1 = clazz.getConstructor();
//        //如果没有就抛出NoSuchMethodException
        Constructor<?> constructor2 = clazz.getConstructor(String.class, int.class);
        //私有化取消临时检查，暴力反射
        constructor2.setAccessible(true);

//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
        Student zhangsan =(Student) constructor2.newInstance("张三", 23);

    }
}
