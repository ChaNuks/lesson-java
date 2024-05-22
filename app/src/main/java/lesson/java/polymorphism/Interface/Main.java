package lesson.java.polymorphism.Interface;

// 인터페이스

public class Main {

    public static void main(String[] args) {

        Apple iPhone = new Apple("아이폰", "iPhone mini", 1200000);
        Samsung galaxy = new Samsung("갤럭시", "Galaxy 24", 1300000);

        mobile(iPhone);
        System.out.println();
        mobile(galaxy);
    }

    public static void mobile(Phone phone) {
        phone.usePhone();
        phone.expensive();
    }
}
