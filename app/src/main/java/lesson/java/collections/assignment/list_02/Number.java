package lesson.java.collections.assignment.list_02;

public class Number {

    private String number;
    private int priority;

    public Number(String number, int priority) {
        this.number = number;
        this.priority = priority;
    }

    public String getNumber() {
        return this.number;
    }

    public int getPriority() {
        return this.priority;
    }
}
