package ClassLoader;

public class Worker {
    private String name;
    private int age;

    public void work(){
        System.out.println("工人正在工作");
    }
    @Override
    public String toString() {
        return "Worker{" +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker() {
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
