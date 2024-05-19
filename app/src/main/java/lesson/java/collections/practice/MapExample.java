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

        // .compute : 주어진 키에 대해 새로운 값을 계산하고, 그 값을 맵에 저장. 키가 존재하지 않으면, 기본 값이 null로 전달된다.
        // ex) 키 "Apple"의 값을 10으로 변경
        map.compute("Apple", (key, value) -> (value == null) ? 10 : value + 10);
        // 키 "Mango"의 값이 없으므로 20으로 설정
        map.compute("Mango", (key, value) -> (value == null) ? 20 : value + 20);

        System.out.println(map); // Apple =11, Cherry = 3, Mango = 20

        // .computeIfAbsent : 주어진 키가 없으면 계산 함수를 사용하여 값을 계산하고, 그 값을 맵에 저장한다.
        // 키 "Apple"이 존재하므로 값이 변경되지 않음
        map.computeIfAbsent("Apple", key -> 10);
        // 키 "Ringo"가 없으므로 값이 20으로 설정됨
        map.computeIfAbsent("Ringo", key -> 30);

        System.out.println(map); // Apple = 11, Cherry = 3, Mango = 20, Ringo = 30

        // .computeIfPresent : 주어진 키가 존재할 때만 계산 함수를 사용하여 값을 계산하고, 그 값을 맵에 저장한다.
        // 키 "Apple"의 값을 10으로 변경
        map.computeIfPresent("Apple", (key, value) -> value + 10);
        // 키 "Ichigo"가 존재하지 않으므로 아무 일도 일어나지 않음
        map.computeIfPresent("Ichigo", (key, value) -> value + 20);

        System.out.println(map); // Apple = 11, Cherry = 3, Mango = 20, Ringo = 30
    }
}

