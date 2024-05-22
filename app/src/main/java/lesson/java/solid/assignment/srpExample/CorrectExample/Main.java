package lesson.java.solid.assignment.srpExample.CorrectExample;

public class Main {

    public static void main(String[] args) {

        IceCream strawberry = new IceCream("딸기맛", 500);
        IceCream choco = new IceCream("초코맛", 700);
        IceCream banana = new IceCream("바나나맛", 900);

        Order order = new Order();

        order.addMenu(strawberry, 2);
        order.addMenu(choco, 1);
        order.addMenu(banana, 5);

        order.printOrder();
    }
}
