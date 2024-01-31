package javaProLessons.lesson_five;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapExample {

//    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AA");
        map.put(2, "BB");
        map.put(3, "CC");
        map.put(1, "DD");

        List<String> list = new LinkedList<>();

        System.out.println(map);
        System.out.println(map.containsKey(1));

    }
}
