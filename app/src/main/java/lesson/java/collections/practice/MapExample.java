package lesson.java.collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Map 생성
        Map<String, Integer> map = new HashMap<>();

        // 키-값 쌍 추가
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // 값 가져오기
        System.out.println("Apple의 값: " + map.get("Apple")); // 1

        // 키-값 쌍 제거
        map.remove("Banana");

        // 키 포함 여부 확인
        System.out.println("Map에 Cherry 키가 있는가? " + map.containsKey("Cherry")); // true

        // 모든 키-값 쌍 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

