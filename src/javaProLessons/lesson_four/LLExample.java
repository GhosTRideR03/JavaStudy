package javaProLessons.lesson_four;

import java.util.ArrayList;
import java.util.List;

public class LLExample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(525);
        list.add(553);

        list.add(2,985);
        list.clear();

        System.out.println(System.currentTimeMillis()-start);


    }
}
