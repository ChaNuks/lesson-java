package lesson.java.statement.assignment.Question01;

import java.time.LocalDate;

public class Info {

    private int age;
    private String country;
    private LocalDate date;

    public Info(int age, String country, LocalDate date) {
        this.age = age;
        this.country = country;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDate() {
        return date;
    }
}
