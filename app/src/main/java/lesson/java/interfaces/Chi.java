package lesson.java.interfaces;

public class Chi implements Dog {

    private String name;
    private int price;

    public Chi(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
