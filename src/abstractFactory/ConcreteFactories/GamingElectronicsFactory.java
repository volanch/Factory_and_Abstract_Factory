package abstractFactory.ConcreteFactories;

import abstractFactory.AbstractFactory.ElectronicsFactory;
import abstractFactory.ConcreteProducts.Gaming.GamingLaptop;
import abstractFactory.ConcreteProducts.Gaming.GamingPhone;
import abstractFactory.AbstractProducts.Laptop;
import abstractFactory.AbstractProducts.Phone;

class GamingElectronicsFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new GamingPhone();
    }
    @Override
    public Laptop createLaptop() {
        return new GamingLaptop();
    }
}
