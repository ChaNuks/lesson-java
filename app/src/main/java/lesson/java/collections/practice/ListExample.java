package lesson.java.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // List 생성
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 요소 가져오기
        System.out.println("첫 번째 요소 : " + list.get(0)); // Apple

        // 요소 제거
        list.remove(1); // Banana 제거

        // 크기 확인
        System.out.println("리스트 크기 : " + list.size()); // 2

        // 모든 요소 출력
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

