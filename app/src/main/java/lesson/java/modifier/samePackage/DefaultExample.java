package lesson.java.modifier.samePackage;

public class DefaultExample implements AccessModifierInterface {

    String defaultEx;

    public DefaultExample(String defaultEx) {
        this.defaultEx = defaultEx;
    }

    @Override
    public void printExample() {
        System.out.println("Default : " + this.defaultEx);
    }
}
