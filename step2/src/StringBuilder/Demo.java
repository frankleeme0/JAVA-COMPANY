package StringBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa");
        sb.append(1).append("bbb" + "ccc"
                + "ddd" +
                "eee" +
                "fff" +
                "ggg" +
                "sss");

        System.out.println(sb);
        BigDecimal bd=BigDecimal.valueOf(0.1);
        BigDecimal b2=BigDecimal.valueOf(0.3);

        bd.divide(b2,2, RoundingMode.CEILING);
        bd.floatValue();
        
    }
}
