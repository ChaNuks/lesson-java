package lesson.java.modifier.samePackage;

public class ProtectedExample implements AccessModifierInterface {

    protected String protectedEx;

    public ProtectedExample(String protectedEx) {
        this.protectedEx = protectedEx;
    }

    @Override
    public void printExample() {
        System.out.println("Protected : " + this.protectedEx);
    }
}
