package InnerClass;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Static.Inner i=new Static.Inner();
        Member.Inner mi=new Member().new Inner();
        System.out.println(i.getClass());
        System.out.println(mi.getClass());

    }
}
