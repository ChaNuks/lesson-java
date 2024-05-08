package lesson.java.interfaces.example.ex01;

public class Coke implements Bevarage{

    private final String name;

    public Coke(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println("맛있어");
    }

    public String getName() {
        return this.name;
    }
}
