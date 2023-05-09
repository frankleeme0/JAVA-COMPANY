package ClassLoader;

public class Student2 {
    private  void show(){
        System.out.println("私有方法无参数无返回值");
    }

    public  void    function1(){
        System.out.println("无参数无返回值");
    }
    public void function2(String name){

        System.out.println("有参数无返回值，参数为"+name);
    }
    public String function3(){
        System.out.println("无参数有返回值");
        return "aaa";
    }

    public String function4(String name){
        System.out.println("有参数有返回值，参数为"+name);
        return "aaa";
    }

}
