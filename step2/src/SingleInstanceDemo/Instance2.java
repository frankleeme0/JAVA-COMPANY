package SingleInstanceDemo;

public class Instance2 {
    private Instance2(){}
    private static Instance2 instance2;
    //懒汉模式

    public static Instance2 getInstance(){
       if(instance2==null) {
           instance2=new Instance2();
       }
        return instance2;
    }
}
