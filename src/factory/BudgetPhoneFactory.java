package factory;

public class BudgetPhoneFactory extends PhoneFactory {

    @Override
    public Phone createPhone() {
        return new BudgetPhone();
    }
}
