package ClassLoader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassLoader system=ClassLoader.getSystemClassLoader();
//        ClassLoader platform=system.getParent();
//        ClassLoader parent=platform.getParent();
//
//        System.out.println(system);
//        System.out.println(platform);
//        System.out.println(parent);

//        Properties prop=new Properties();
//        prop.setProperty("a","1");
//        prop.setProperty("b","2");
//        prop.setProperty("c","3");
//
//        FileWriter fw=new FileWriter("prop.properties");
//        prop.store(fw,null);
//        fw.close();


        InputStream is=ClassLoader.getSystemClassLoader().getResourceAsStream("prop.properties");
        Properties prop1=new Properties();
        prop1.load(is);


        is.close();

        //反射，类名唯一
        Class<?> aclass= Class.forName("ClassLoader.Student");
        System.out.println(aclass);

        Class studentClass = Student.class;

        Student s=new Student();
        //getClass是定义在Object类中
        Class aaclass = s.getClass();



    }
}
