package slice.complex.lambda;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stream_api {

    public void way() {
        Set<String> ss = new LinkedHashSet<>();
        ss.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("a");
                    }
                })
                .collect(Collectors.toList());
    }
}
