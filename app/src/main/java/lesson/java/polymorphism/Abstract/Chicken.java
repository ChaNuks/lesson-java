package lesson.java.polymorphism.Abstract;

public class Chicken extends Food{

    public Chicken() {
        super(2000);
    }

    @Override
    public void eat() {
        System.out.println("치킨을 먹었다.");
    }
}
