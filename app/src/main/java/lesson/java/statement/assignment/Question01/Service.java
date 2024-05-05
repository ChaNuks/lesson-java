package lesson.java.statement.assignment.Question01;

import java.time.LocalDate;

public class Service {

    public static int calculateAge(int age, String country, LocalDate date) {
        if (country.equals("KOREA") && date.isEqual(date) || date.isAfter(date)) {
            return age - 1;
        }
        return age;
    }
}
