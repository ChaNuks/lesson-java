package lesson.java.modifier.anotherPackage;

import lesson.java.modifier.samePackage.*;

public class Main {

    public static void main(String[] args) {

        DefaultExample defaultExample = new DefaultExample("불가능");
        PublicExample publicExample = new PublicExample("가능");
        ProtectedExample protectedExample = new ProtectedExample("불가능");
        PrivateExample privateExample = new PrivateExample("불가능");

        System.out.println("다른 패키지 내에서 접근");
        printAccessModifier(publicExample);

        // 접근 확인
        // System.out.println(defaultExample.defaultEx); // default : 같은 패키지 내에서만 접근 가능
        System.out.println(publicExample.publicEx); // public : 어디든 접근 가능
        // System.out.println(protectedExample.protectedEx); // protected : 같은 패키지 내의 클래스와 다른 패키지의 서브클래스에서 접근 가능
        // System.out.println(privateExample.privateEx); // private : 선언된 클래스 내에서만 접근 가능
    }

    public static void printAccessModifier(AccessModifierInterface accessModifierInterface) {
        accessModifierInterface.printExample();
    }
}
