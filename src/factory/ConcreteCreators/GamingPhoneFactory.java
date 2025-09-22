package factory.ConcreteCreators;

import factory.ConcreteProducts.GamingPhone;
import factory.Creator.PhoneFactory;
import factory.ProductInterface.Phone;

public class GamingPhoneFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new GamingPhone();
    }
}
