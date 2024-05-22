package lesson.java.interfaces.example.ex01;

public class Cider implements Bevarage{

    private final String name;

    public Cider(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println("맛없어");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
