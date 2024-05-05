package lesson.java.statement.assignment.Question01;

import java.time.LocalDate;
import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Info InputData() {

        System.out.println("나이 입력 : ");
        int age = scanner.nextInt();

        System.out.println("나라 입력 : ");
        String country = scanner.nextLine();

        System.out.println("날짜 입력 : ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        return InputData();
    }
}
