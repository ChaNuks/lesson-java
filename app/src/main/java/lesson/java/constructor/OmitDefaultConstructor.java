package lesson.java.constructor;

// 기본 생성자 생략

public class OmitDefaultConstructor {

    private String name;
    private int age;

    public OmitDefaultConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
