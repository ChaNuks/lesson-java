package lesson.java.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Set 생성
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복 요소는 추가되지 않음

        // 요소 포함 여부 확인
        System.out.println("Set에 Apple이 있는가? " + set.contains("Apple")); // true

        // 요소 제거
        set.remove("Banana");

        // 크기 확인
        System.out.println("Set 크기: " + set.size()); // 2

        // 모든 요소 출력
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
