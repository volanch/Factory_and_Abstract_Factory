package factory.ConcreteCreators;

import factory.ConcreteProducts.BudgetPhone;
import factory.Creator.PhoneFactory;
import factory.ProductInterface.Phone;

public class BudgetPhoneFactory extends PhoneFactory {

    @Override
    public Phone createPhone() {
        return new BudgetPhone();
    }
}
