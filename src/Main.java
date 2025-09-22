import abstractFactory.AbstractFactory.ElectronicsFactory;
import abstractFactory.AbstractProducts.Laptop;
import abstractFactory.ConcreteFactories.BudgetElectronicsFactory;
import abstractFactory.AbstractProducts.Phone;
import factory.ConcreteCreators.GamingPhoneFactory;
import factory.Creator.PhoneFactory;

public class Main {
    public static void main(String[] args) {
        //factory
        PhoneFactory factory1 = new GamingPhoneFactory();
        factory1.showSpecs();

        System.out.println();

        //abstract factory
        ElectronicsFactory factory2 = new BudgetElectronicsFactory();
        Phone phone = factory2.createPhone();
        Laptop laptop = factory2.createLaptop();

        laptop.specs();
        phone.specs();
    }
}