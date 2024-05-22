package lesson.java.question2;

// 클래스를 만들고 객체를 생성했을때와 main 메서드에서 기본형 변수를 사용했을때 각각 어느 메모리 영역에 저장되는지 설명해 보세요

public class Question06 {

    public static void main(String[] args) {

        int price = 10000;
        String name = "김철수";
        Owner owner = new Owner("김철수");
        Hotel hotel = new Hotel("김철수", 100000);
    }
}
