package lesson.java.collections.assignment.set_01;

// 1. 중복 제거

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("커피빈", "서울"));
        coffeeList.add(new Coffee("스타벅스", "서울"));
        coffeeList.add(new Coffee("메카커피", "서울"));
        coffeeList.add(new Coffee("커피빈", "서울"));
        coffeeList.add(new Coffee("스타벅스", "서울"));
        coffeeList.add(new Coffee("메가커피", "서울"));
        coffeeList.add(new Coffee("커피빈", "경기"));
        coffeeList.add(new Coffee("스타벅스", "경기"));
        coffeeList.add(new Coffee("메가커피", "경기"));
        coffeeList.add(new Coffee("메가커피", "경기"));

        Map<Coffee, Coffee> coffeeMap = new HashMap<>();

        for (Coffee coffees : coffeeList) {
            coffeeMap.put(coffees, coffeeMap.getOrDefault(coffees, coffees));
        }

        System.out.println(coffeeList);

    }
}
