package ClassLoader;

public class Student1 {
    public String name;
    public int  age;
    public  String gender;
    private  int money=300;


    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
