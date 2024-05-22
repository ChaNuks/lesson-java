package lesson.java.solid.assignment.srpExample.IncorrectExample;

public class Main {

    public static void main(String[] args) {

        int strawberryPrice = 2000;
        int chocoPrice = 3000;
        int bananaPrice = 4000;

        int strawberryCount = 1;
        int chocoCount = 1;
        int bananaCount = 1;

        int totalPrice = calculateTotalPrice(strawberryPrice, strawberryCount, chocoPrice, chocoCount, bananaPrice, bananaCount);

        System.out.println("딸기 아이스크림 " + strawberryCount + "개, 초코 아이스크림 " + chocoCount + "개, 바나나 아이스크림 " + bananaCount + "개을(를) 선택하셨습니다.");
        System.out.println("총 가격 : " + totalPrice + "원");
    }

    public static int calculateTotalPrice(int strawberryPrice, int strawberryCount, int chocoPrice, int chocoCount, int bananaPrice, int bananaCount) {

        int totalStrawberryPrice = strawberryPrice * strawberryCount;
        int totalChocoPrice = chocoPrice * chocoCount;
        int totalBananaPrice = bananaPrice * bananaCount;

        return totalStrawberryPrice + totalChocoPrice + totalBananaPrice;
    }
}


