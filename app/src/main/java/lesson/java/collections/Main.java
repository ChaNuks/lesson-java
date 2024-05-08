package lesson.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //1. a,b,c,c,d 중복을 제거해서 출력해보세요
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add("d");

        System.out.println(set);


        /*    2. ID값 뽑기 김철수 11111, 김길동 11112 김수진 111113
         ID값 추출 김철수 11111, 김길동 11112 김수진 111113*/
        Map<String, Integer> map = new HashMap<>();

        map.put("김철수", 11111);
        map.put("김길동", 11112);
        map.put("김수진", 11113);

        System.out.println(map.getOrDefault("김철", 11122));
    }
}
