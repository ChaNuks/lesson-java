package lesson.java.statement;

/*
1. fruit 변수가 있고  “사과” → “APPLE”, “바나나” → “BANANA”,  그외 → “ETC” 를 출력해주세요
    1. 위의 문제를 switch 문으로 만들어주세요
*/

public class Main {
    public static void main(String[] args) {

        String fruit = "사과";

    /*    if ("사과".equals(fruit)) {
            System.out.println("APPLE");
        } else if ("바나나".equals(fruit)) {
            System.out.println("BANANA");
        } else {
            System.out.println("ETC");
        }*/

        switch (fruit) {
            case "사과":
                System.out.println("APPLE");
                break;
            case "바나나":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ETC");
        }
    }
}
