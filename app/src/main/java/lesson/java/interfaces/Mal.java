package lesson.java.interfaces;

public class Mal implements Dog{

    private String name;

    public Mal(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
