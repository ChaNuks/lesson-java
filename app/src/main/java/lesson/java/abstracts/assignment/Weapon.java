package lesson.java.abstracts.assignment;

public abstract class Weapon {

    public void battle() {

        System.out.println("=== 공격 시작 ===");
        for (int i = 0; i < 5; i++) {
            attack();
        }
        System.out.println("=== 공격 종료 ===");
    }

    public abstract void attack();

}
