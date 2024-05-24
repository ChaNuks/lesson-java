package lesson.java.solid.assignment.ispExample.CorrectExample;

public class HouseCat implements EatInterface, SleepInterface{

    @Override
    public void eat() {
        System.out.println("집 고양이는 사료를 먹는다.");
    }

    @Override
    public void sleep() {
        System.out.println("집 고양이는 잠을 잔다.");
    }
}
