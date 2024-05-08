package lesson.java.interfaces;

// 치와와, 말라뮤트 클래스화

public class Main {
    public static void main(String[] args) {

        Chi dog = new Chi("치와와");
        Dog dog1 = new Mal("말라뮤트");

        dog.sound();
        dog1.sound();

        System.out.println(dog.getName());
        System.out.println(dog1.getName());

        dog.getPrice();
    }
}
