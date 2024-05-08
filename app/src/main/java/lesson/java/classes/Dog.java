package lesson.java.classes;

public class Dog {

    private String name;
    String type;
    int price;
    String owner;
    Integer ownerPrice;

    public Dog(String name, String type, int price) {
        this(name, type, price, null);
    }

    public Dog(String name, String type, int price, String owner) {
        this(name, type, price, owner, null);
    }

    public Dog(String name, String type, int price, String owner, Integer ownerPrice) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.owner = owner;
        this.ownerPrice = ownerPrice;
    }

      public void sound() {

        if ("치와와".equals(this.type)) {
            System.out.println("왈왈");
            return; // 얼리 리턴
        }

        if ("말라뮤트".equals(this.type)) {
            System.out.println("멍멍");
        }
    }

    public String getName() {
        return this.name;
    }

}
