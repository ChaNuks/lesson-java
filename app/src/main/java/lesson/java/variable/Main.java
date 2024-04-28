package lesson.java.variable;

public class Main {

    public static void main(String[] args) {
        String apple1 = "apple";
        String apple2 = "apple";
        String apple3 = "appleapple";
        String apple4 = new String(apple1);

        // String은 값 그 자체를 비교하자
        System.out.println(apple1.equals(apple2));
        System.out.println(apple1.equals(apple4));
        System.out.println((apple1 + apple2).equals(apple3));

/*        System.out.println(System.identityHashCode(apple3)); //359023572
        System.out.println(System.identityHashCode("apple" + "apple")); // 359023572
        System.out.println(System.identityHashCode(apple1+ apple2)); // 66557614*/
    }
}
