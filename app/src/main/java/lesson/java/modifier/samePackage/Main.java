package lesson.java.modifier.samePackage;

// 같은 패키지에서 호출

public class Main {

    public static void main(String[] args) {

        DefaultExample defaultExample = new DefaultExample("가능");
        PublicExample publicExample = new PublicExample("가능");
        ProtectedExample protectedExample = new ProtectedExample("가능");
        PrivateExample privateExample = new PrivateExample("가능");

        // AccessModifierInterface 인터페이스에 정의된 printExample 메서도를 호출하므로, 접근 제어자의 영향을 받지 않음
        printAccessModifier(defaultExample);    // 가능
        printAccessModifier(publicExample);     // 가능
        printAccessModifier(protectedExample);  // 가능
        printAccessModifier(privateExample);    // 가능

        System.out.println();

        // 각 객체의 필드에 직접 접근하므로, 접근 제어자에 따라 접근 여부가 달라짐
        System.out.println(defaultExample.defaultEx);   // 가능
        System.out.println(publicExample.publicEx);     // 가능
        System.out.println(protectedExample.protectedEx);   // 가능
//        System.out.println(privateExample.printEx);       // 불가능 (컴파일 에러)
    }

    public static void printAccessModifier(AccessModifierInterface accessModifierInterface) {

        accessModifierInterface.printExample();
    }
}
