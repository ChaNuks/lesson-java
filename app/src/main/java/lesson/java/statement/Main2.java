package lesson.java.statement;

// 1~10 까지 누적한 결과를 출력 (각각 for 문, while 문)

public class Main2 {

    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;
        int i = 1;

//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        while (i <= 10) {   // 조건식이 들어간다.
            sum2 = sum2 + i;
            i++;
        }
        System.out.println(sum2);
    }
}
