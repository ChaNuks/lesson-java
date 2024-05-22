package lesson.java.polymorphism.Abstract;

public class Pizza extends Food{

    public Pizza() {
        super(2300);
    }

    @Override
    public void eat() {
        System.out.println("피자를 먹었다");
    }
}
