package lesson.java.collections.assignment.list_03;

/*
1. 다음 Car를 구현한 객체들의 판매가격 오름차순 [같은 경우 출고월이 빠른순]
2. deliveryDate는 YearMonth 타입 이다.

inteface Car -> Class Tesla , Class BMW, Class Audi

Tesla(name = "모델3", price = 500, deliveryDate=2023-11)
BMW(name = "320i", price = 600, deliveryDate=2023-12)
Audi(name = "A4", price = 500, deliveryDate=2023-10)
Tesla(name = "모델S", price = 700, deliveryDate=2023-09)
BMW(name = "X5", price = 800, deliveryDate=2023-11)
Audi(name = "Q5", price = 700, deliveryDate=2023-12)
Tesla(name = "모델Y", price = 600, deliveryDate=2023-10)

답
Audi(name = "A4", price = 500, deliveryDate=2023-10)
Tesla(name = "모델3", price = 500, deliveryDate=2023-11)
Tesla(name = "모델Y", price = 600, deliveryDate=2023-10)
BMW(name = "320i", price = 600, deliveryDate=2023-12)
Audi(name = "Q5", price = 700, deliveryDate=2023-12)
Tesla(name = "모델S", price = 700, deliveryDate=2023-09)
BMW(name = "X5", price = 800, deliveryDate=2023-11)
*/

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Tesla("모델3", 500, YearMonth.of(2023, 11)));
        carList.add(new BMW("320i", 600, YearMonth.of(2023, 12)));
        carList.add(new Audi("A4", 500, YearMonth.of(2023, 10)));
        carList.add(new Tesla("모델S", 700, YearMonth.of(2023, 9)));
        carList.add(new BMW("X5", 800, YearMonth.of(2023, 11)));
        carList.add(new Audi("Q5", 700, YearMonth.of(2023, 12)));
        carList.add(new Tesla("모델Y", 600, YearMonth.of(2023, 10)));

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {

                int priceComparison = Integer.compare(o1.getPrice(), o2.getPrice());

                if (priceComparison != 0) {
                    return priceComparison;
                } else {
                    return o1.getDeliveryDate().compareTo(o2.getDeliveryDate());
                }
            }
        };

        carList.sort(carComparator);

        for (Car car : carList) {
            System.out.println(car.getClass().getSimpleName() + " (model = " + car.getModel() + ", " + "price = " + car.getPrice() + ", " + "deliverDate = " + car.getDeliveryDate() + ")");
        }
    }
}
