package ClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("ClassLoader.Student2");

        Method[] methods = aClass.getMethods();

//        for (Method method : methods) {
//            System.out.println(method);
//        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

        Method function1 = aClass.getMethod("function2", String.class);
        Method function4= aClass.getMethod("function4", String.class);

        Method show = aClass.getDeclaredMethod("show");



        //运行方法
        Object o = aClass.newInstance();
        Object zhangsan = function4.invoke(o, "zhangsan");
        System.out.println(zhangsan);

    }
}
