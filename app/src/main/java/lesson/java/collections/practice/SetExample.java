package lesson.java.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Set1 생성
        Set<String> set1 = new HashSet<>();

        // 요소 추가
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Apple"); // 중복 요소는 추가되지 않음

        // Set2 생성
        Set<String> set2 = new HashSet<>();

        // 요소 추가
        set2.add("Apple2");
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Apple2");

        // 요소 포함 여부 확인
        System.out.println("Set에 Apple이 있는가? " + set1.contains("Apple")); // true

        // 요소 제거
        set1.remove("Banana");

        // 크기 확인
        System.out.println("Set 크기: " + set1.size()); // 2

        // 모든 요소 출력
        for (String fruit : set1) {
            System.out.println(fruit);
        }

        // .retainAll : 현재 Set에서 주어진 컬렉션에 포함된 요소만 유지한다. 다른 모든 요소는 제거된다.
        // set1에서 set2에 있는 요소만 유지
        set1.retainAll(set2);
        System.out.println(set1); // Cherry
    }
}
