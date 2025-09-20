package abstractFactory;

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
