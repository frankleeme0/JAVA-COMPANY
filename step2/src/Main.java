public class Main {
    public  Main(){

    }

    /**
     * @return  {@code true}
     * @param args
     */
    public static void main(String[] args) {
        enum Season{
            SPRING,SUMMER,AUTUMN,WINTER;
        }

        //Phone mp=new MyPhone();

        MyPhone mp=(MyPhone) new Phone();
        mp.send();
        mp.call();


        System.out.println("Hello world!");
    }
}

class Phone{
    public Phone(){}
    public void call(){

    }
     public static void test(){

    }
}
class MyPhone extends Phone{
//    @Override
//    public void call(){
//
//        test();
//        return ;
//    }
    public MyPhone(){
        super();
    }

    public void send(){

    }

}

interface Demo{
    default void run(){

    }

}