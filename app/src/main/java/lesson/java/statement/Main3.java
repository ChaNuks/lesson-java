package lesson.java.statement;

// 1~100 까지 짝수만 출력

public class Main3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + "\n");
            }
        }
    }
}
