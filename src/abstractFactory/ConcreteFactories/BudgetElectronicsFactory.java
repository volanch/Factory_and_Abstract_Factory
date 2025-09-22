package abstractFactory.ConcreteFactories;

import abstractFactory.AbstractFactory.ElectronicsFactory;
import abstractFactory.ConcreteProducts.Budget.BudgetLaptop;
import abstractFactory.ConcreteProducts.Budget.BudgetPhone;
import abstractFactory.AbstractProducts.Laptop;
import abstractFactory.AbstractProducts.Phone;

public class BudgetElectronicsFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new BudgetPhone();
    }
    @Override
    public Laptop createLaptop() {
        return new BudgetLaptop();
    }
}
