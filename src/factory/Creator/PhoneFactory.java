package factory.Creator;

import factory.ProductInterface.Phone;

public abstract class PhoneFactory {
    public abstract Phone createPhone();

    public void showSpecs() {
        Phone phone = createPhone();
        phone.specs();
    }
}