package lesson.java.collections.assignment.list_02;

/*
1. 다음 객체 num 오름차순 [같은 경우 우선순위가 높은것]

- Num(num = “5”, priority = 1)
- Num(name = “8”, priority = 1)
- Num(name = “10”, priority = 1)
- Num(name = “10”, priority = 2)
- Num(name = “1”, priority = 2)
- Num(name = “1”, priority = 1)
- Num(name = “1”, priority = 3)
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();

        numbers.add(new Number("5", 1));
        numbers.add(new Number("8", 1));
        numbers.add(new Number("10", 1));
        numbers.add(new Number("10", 2));
        numbers.add(new Number("1", 2));
        numbers.add(new Number("1", 1));
        numbers.add(new Number("1", 3));

        Comparator<Number> numbersComparator = new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {

                int numComparison = Integer.compare(Integer.parseInt(o1.getNumber()), Integer.parseInt(o2.getNumber()));

                if (numComparison == 0) {
                    return numComparison;
                } else {
                    return o1.getPriority();
                }
            }
        };

        numbers.sort(numbersComparator);

        for (Number number : numbers) {
            System.out.println("Num " + "(num = " + number.getNumber() + ", " + "priority = " + number.getPriority() + ")");
        }
    }
}
