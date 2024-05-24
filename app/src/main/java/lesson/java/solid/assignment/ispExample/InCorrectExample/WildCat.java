package lesson.java.solid.assignment.ispExample.InCorrectExample;

public class WildCat implements Animal{

    @Override
    public void hunt() {
        System.out.println("야생 고양이는 사냥이 필요하다.");
    }

    @Override
    public void eat() {
        System.out.println("야생 고양이는 사냥감을 먹는다.");
    }

    @Override
    public void sleep() {
        System.out.println("야생 고양이는 잠을 잔다.");
    }
}
