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

Map<String, Integer>로 저장하면 각 이름마다 하나의 가격만 저장할 수 있기 때문에, 동일한 이름의 호텔이 여러 개 있을 경우 마지막으로 저장된 값만 남음
따라서, 이름과 가격 쌍을 모두 저장하려면 Map<String, List<Integer>>를 사용해야 한다.
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 진행 중
public class Main {

    public static void main(String[] args) {

        Map<String, List<Hotel>> hotelMap = new HashMap<>();

        addHotel(hotelMap, "신라", 10000);
        addHotel(hotelMap, "롯데", 20000);
        addHotel(hotelMap, "신라", 25000);
        addHotel(hotelMap, "롯데", 30000);
        addHotel(hotelMap, "신라", 25000);


    }

    static void addHotel(Map<String, List<Hotel>> hotelMap, String name, int price) {
        Hotel hotel = new Hotel(name, price);
        hotelMap.computeIfAbsent(name, key -> new ArrayList<>()).add(hotel);
    }
}
