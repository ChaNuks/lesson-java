package lesson.java.statement.assignment.Question02;

public class Star {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
