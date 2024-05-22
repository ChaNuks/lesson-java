package lesson.java.modifier.samePackage;

public class PrivateExample implements AccessModifierInterface{

    private String privateEx;

    public PrivateExample(String privateEx) {
        this.privateEx = privateEx;
    }

    @Override
    public void printExample() {
        System.out.println("Private : " + this.privateEx);
    }
}
