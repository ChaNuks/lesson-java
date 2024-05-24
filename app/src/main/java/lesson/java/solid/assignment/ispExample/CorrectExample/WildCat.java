package lesson.java.solid.assignment.ispExample.CorrectExample;

public class WildCat implements HuntInterface, EatInterface, SleepInterface{

    @Override
    public void eat() {
        System.out.println("야생 고양이는 사냥을 한다.");
    }

    @Override
    public void hunt() {
        System.out.println("야생 고양이는 사냥감을 먹는다.");
    }

    @Override
    public void sleep() {
        System.out.println("야생 고양이는 잠을 잔다.");
    }
}
