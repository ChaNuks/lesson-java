package lesson.java.modifier.samePackage;

public class PublicExample implements AccessModifierInterface {

    public String publicEx;

    public PublicExample(String publicEx) {
        this.publicEx = publicEx;
    }

    @Override
    public void printExample() {
        System.out.println("Public : " + this.publicEx);
    }
}
