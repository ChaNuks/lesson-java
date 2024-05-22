package lesson.java.constructor;

public class Main {
    public static void main(String[] args) {

        IncludeDefaultConstruct includeDefaultConstruct = new IncludeDefaultConstruct();
        OmitDefaultConstructor omitDefaultConstructor = new OmitDefaultConstructor("기본 생성자 없음", 10);

        // 기본 생성자 있음
        System.out.println(includeDefaultConstruct.getName());
        System.out.println(includeDefaultConstruct.getAge());

        // 기본 생성자 없음
        System.out.println(omitDefaultConstructor.getName());
        System.out.println(omitDefaultConstructor.getAge());
    }
}
