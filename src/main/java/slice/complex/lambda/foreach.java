package slice.complex.lambda;

import java.util.LinkedHashSet;
import java.util.Set;


public class foreach {

    public void way() {
        Set<String> ss = new LinkedHashSet<>();
        for (String s : ss) {
            s += ",";
        }
        System.out.println(ss);
    }
}
