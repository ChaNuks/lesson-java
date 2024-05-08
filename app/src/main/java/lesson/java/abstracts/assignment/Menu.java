package lesson.java.abstracts.assignment;

import java.util.Scanner;

class Menu {

    static int getStartMenu(Scanner scanner) {
        System.out.println("1. 시작하기 2. 종료하기");
        return scanner.nextInt();
    }

    static int getWeaponMenu(Scanner scanner) {
        System.out.println("무기를 선택하세요.");
        System.out.println("1. Sword 2. Cane 3. Bow");
        return scanner.nextInt();
    }

    static int getBattleMenu(Scanner scanner) {
        System.out.println("1. 전투 2. 뒤로가기");
        return scanner.nextInt();
    }
}
