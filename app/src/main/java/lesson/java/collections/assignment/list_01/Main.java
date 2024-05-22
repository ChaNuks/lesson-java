package lesson.java.collections.assignment.list_01;

/*
- List
1. 문자열 길이에 따라 내림차순 정렬[길이가 같은 경우 영어 오름차순]
"banana", "apple", "korea", "new jeans" , "oak", "spring", "luxury"
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listt = new ArrayList<>();

        listt.add("banana");
        listt.add("apple");
        listt.add("korea");
        listt.add("new jeans");
        listt.add("oak");
        listt.add("spring");
        listt.add("luxury");

        // 오름차순으로 정렬하기

        listt.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });

        System.out.println("오름차순 : " + listt);

        listt.sort(Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        }));

        System.out.println("내림차순 : " + listt);
    }
}
