package lesson.java.abstracts.assignment;

import java.util.Scanner;

class Battle {

    static void start(Scanner scanner) {

        int weaponMenu = Menu.getWeaponMenu(scanner);

        Weapon weapon = null;   // 초기화

        switch (weaponMenu) {
            case 1 :
                weapon = new Sword();
                System.out.println("Sword을(를) 선택하였습니다.");
                break;
            case 2 :
                weapon = new Cane();
                System.out.println("Cane을(를) 선택하였습니다.");
                break;
            case 3 :
                weapon = new Bow();
                System.out.println("Bow을(를) 선택하였습니다.");
                break;
            default :
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                return; // 종료
        }

        while (true) {

            int battleMenu = Menu.getBattleMenu(scanner);

            if (battleMenu == 1) {

                weapon.battle();

            } else if (battleMenu == 2) {
                return; // 종료
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
