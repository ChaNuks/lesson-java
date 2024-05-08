package lesson.java.abstracts.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int startMenu = Menu.getStartMenu(scanner);

            if (startMenu == 1) {
                Battle.start(scanner);
            } else if (startMenu == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();
    }
}