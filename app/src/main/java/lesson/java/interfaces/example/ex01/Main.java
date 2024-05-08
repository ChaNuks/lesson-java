package lesson.java.interfaces.example.ex01;

public class Main {

    public static void main(String[] args) {

        Cider cider = new Cider("사이다");
        Coke coke = new Coke("콜라");

        System.out.print(cider.getName() + "(은)는 ");
        cider.drink();

        System.out.print(coke.getName() + "(은)는 ");
        coke.drink();
    }
}
