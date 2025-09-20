import abstractFactory.Phone;
import factory.*;
import abstractFactory.*;

public class Main {
    public static void main(String[] args) {
        PhoneFactory factory1 = new GamingPhoneFactory();
        factory1.showSpecs();

        ElectronicsFactory factory2 = new BudgetElectronicsFactory();
        Phone phone = factory2.createPhone();
        Laptop laptop = factory2.createLaptop();

        laptop.specs();
        phone.specs();
    }
}