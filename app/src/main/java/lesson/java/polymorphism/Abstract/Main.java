package lesson.java.polymorphism.Abstract;

// 추상화

public class Main {

    public static void main(String[] args) {

        Chicken eatChicken = new Chicken();
        Pizza eatPizza = new Pizza();

        eatChicken.eat();
        eatChicken.printCalorie();
        eatChicken.badFood();

        System.out.println();

        eatPizza.eat();
        eatPizza.printCalorie();
        eatPizza.badFood();

    }
}
