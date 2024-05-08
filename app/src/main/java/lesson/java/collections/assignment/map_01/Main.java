package lesson.java.collections.assignment.map_01;

/*
- Map
1. 같은 호텔인 경우 각각의 리스트로 변경

- Hotel(name = “신라”, price = 10000)
- Hotel(name = “롯데”, price = 20000)
- Hotel(name = “신라”, price = 25000)
- Hotel(name = “롯데”, price = 30000)
- Hotel(name = “신라”, price = 25000)

List[Hotel(name = “신라”, price = 10000), Hotel(name = “신라”, price = 25000), Hotel(name = “신라”, price = 25000)]
List[Hotel(name = “롯데”, price = 20000), Hotel(name = “롯데”, price = 30000)]
*/


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> hotelMap = new HashMap<>();

        hotelMap.put("신라", 10000);
        hotelMap.put("롯데", 20000);
        hotelMap.put("신라", 25000);
        hotelMap.put("롯데", 30000);
        hotelMap.put("신라", 25000);
    }
}
