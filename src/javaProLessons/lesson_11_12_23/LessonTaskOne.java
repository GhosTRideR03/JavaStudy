package javaProLessons.lesson_11_12_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LessonTaskOne {

    public static void main(String[] args) {

        String str = "txt";
        System.out.println(isPalindrome(str));

    }


    static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();

        List<Character> list = new ArrayList<>();
        for (char c : arr) {
            list.add(c);
        }
        ListIterator<Character> listIterator = list.listIterator(list.size());
        StringBuilder temp = new StringBuilder();
        while (listIterator.hasPrevious()) {
           temp.append(listIterator.previous());
        }
        return str.equals(temp.toString());
    }
}