package q2;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Boolean> checkString = s -> s.charAt(0) == s.charAt(s.length() - 1);
        System.out.println(checkString.apply("aabba"));
    }
}

