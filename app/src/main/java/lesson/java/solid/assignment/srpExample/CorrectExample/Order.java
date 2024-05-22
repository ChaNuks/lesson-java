package lesson.java.solid.assignment.srpExample.CorrectExample;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<IceCream, Integer> products;

    public Order() {
        this.products = new HashMap<>();
    }

    public void addMenu(IceCream iceCream, int count) {
        products.put(iceCream, products.getOrDefault(iceCream, 0) + count);
    }

    public int calculateTotalPrice() {

        int totalPrice = 0;

        for (Map.Entry<IceCream, Integer> entry : products.entrySet()) {
            totalPrice = totalPrice + entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void printOrder() {

        for (Map.Entry<IceCream, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey().getMenu() + " 아이스크림 " + entry.getValue() + "개");
        }

        System.out.println("총 가격 : " + calculateTotalPrice() + "원");
    }
}
