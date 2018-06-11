package java8.defaultmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "SCALA"));
        Collections.sort(languages);
    }
}
