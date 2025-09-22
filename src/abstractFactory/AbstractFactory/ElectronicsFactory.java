package abstractFactory.AbstractFactory;

import abstractFactory.AbstractProducts.Laptop;
import abstractFactory.AbstractProducts.Phone;

public interface ElectronicsFactory {
    Phone createPhone();
    Laptop createLaptop();
}
