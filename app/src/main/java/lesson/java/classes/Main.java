package lesson.java.classes;

/*# 예제1 - Dog 클래스 만들기(1)

- 필드 : 이름, 종류(치와와, 말라뮤트), 분양가격, 주인이름,
- 기능 : 울음소리
  => 울음소리 : 치와와는 왈왈, 말라뮤트는 멍멍을 출력한다.*/

/*변수 주인의 자산을 추가
- 분양가격이 10,000,000원 이상 이면 주인의 자산가격을 가진다. (Main에서 처리)*/

public class Main {
    public static void main(String[] args) {

        Dog 치와와 = new Dog("개똥이", "치와와", 30000, "개똥이 주인");
        Dog 말라뮤트 = new Dog("나비", "말라뮤트", 20000, "말라 주인");

        치와와.sound();
        말라뮤트.sound();

        Dog 치와와주인 = new Dog("개똥이", "치와와", 100000000, "개똥이 주인", 1000000000);
        Dog 말라뮤트주인 = new Dog("나비", "말라뮤트", 200000000, "말라 주인", 500000000);

        Dog dog = new Dog("아아", "치와와", 10000);

        System.out.println(dog.getName());

    }
}
