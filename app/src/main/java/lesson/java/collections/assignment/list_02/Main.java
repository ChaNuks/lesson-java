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

        List<Numbers> numbersList = new ArrayList<>();

        numbersList.add(new Numbers("5", 1));
        numbersList.add(new Numbers("8", 1));
        numbersList.add(new Numbers("10", 1));
        numbersList.add(new Numbers("10", 2));
        numbersList.add(new Numbers("1", 2));
        numbersList.add(new Numbers("1", 1));
        numbersList.add(new Numbers("1", 3));

        Comparator<Numbers> numbersComparator = new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {

                int numComparison = Integer.compare(Integer.parseInt(o1.getNumber()), Integer.parseInt(o2.getNumber()));

                if (numComparison == 0) {
                    return numComparison;
                } else {
                    return o1.getPriority();
                }
            }
        };

        numbersList.sort(numbersComparator);

        for (Numbers numbers : numbersList) {
            System.out.println("Num " + "(num = " + numbers.getNumber() + ", " + "priority = " + numbers.getPriority() + ")");
        }
    }
}
