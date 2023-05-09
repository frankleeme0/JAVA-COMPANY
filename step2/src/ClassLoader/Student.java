package ClassLoader;

public class Student {
    private  String name;
    private  int age;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name) {


    }
    public Student() {
    }

    public void  study(){
        System.out.println("学生正在学习");
    }
}
