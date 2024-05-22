package lesson.java.solid.assignment.ocpExample.InCorrectExample;

import java.util.ArrayList;
import java.util.List;

public class AppleStore {

    private final List<Laptop> laptops = new ArrayList<>();
    private final List<Phone> phones = new ArrayList<>();
    private final List<IPad> iPads = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void addIPad(IPad ipad) {
        iPads.add(ipad);
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public List<IPad> getIPads() {
        return iPads;
    }
}
