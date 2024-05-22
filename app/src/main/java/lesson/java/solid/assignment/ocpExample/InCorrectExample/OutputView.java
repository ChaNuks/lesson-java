package lesson.java.solid.assignment.ocpExample.InCorrectExample;

import java.util.List;

public class OutputView {

    public void printResult(List<Laptop> laptops, List<Phone> phones, List<IPad> iPads) {

        System.out.println("노트북 종류");
        for (Laptop laptop : laptops) {
            System.out.println("모델 : " + laptop.getModel() + ", " + "가격 : " + laptop.getPrice() + "원");
        }

        System.out.println("폰 종류");
        for (Phone phone : phones) {
            System.out.println("모델 : " + phone.getModel() + ", " + "가격 : " + phone.getPrice() + "원");
        }

        System.out.println("아이패드 종류");
        for (IPad iPad : iPads) {
            System.out.println("모델 : " + iPad.getModel() + ", " + "가격 : " + iPad.getPrice() + "원");
        }
    }
}
