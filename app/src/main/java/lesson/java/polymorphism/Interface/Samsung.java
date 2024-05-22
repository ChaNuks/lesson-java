package lesson.java.polymorphism.Interface;

public class Samsung implements Phone {

    private String name;
    private String model;
    private int price;

    public Samsung(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public void usePhone() {
        System.out.println("나는 " + this.name + "을(를) 사용한다.");
        System.out.println("모델은 " + this.model + "이다.");
        System.out.println("가격은 " + this.price + "원 이다.");
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void expensive() {
        System.out.println("비싸다.");
    }
}
