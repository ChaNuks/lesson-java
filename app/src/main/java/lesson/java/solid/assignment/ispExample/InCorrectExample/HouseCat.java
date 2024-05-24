package lesson.java.solid.assignment.ispExample.InCorrectExample;

public class HouseCat implements Animal{

    // 굳이 필요없지만 Animal 인터페이스에 있어서 강제로 넣게 되는 문제 발생
    @Override
    public void hunt() {
        System.out.println("집 고양이는 사냥이 필요없다.");
    }

    @Override
    public void eat() {
        System.out.println("집 고양이는 사료를 먹는다.");
    }

    @Override
    public void sleep() {
        System.out.println("집 고양이는 잠을 잔다.");
    }
}
