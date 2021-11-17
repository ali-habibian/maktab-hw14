package q4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of(new String[]{"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood",
                "Reza", "Mohsen"});

        sortByLength(stringList);
        sortAndGroupByLength(stringList);
    }

    private static void sortByLength(List<String> stringList) {
        stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

    private static void sortAndGroupByLength(List<String> stringList) {
        Map<Integer, List<String>> stringMap = stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.groupingBy(String::length));
        System.out.println(stringMap);
    }
}
