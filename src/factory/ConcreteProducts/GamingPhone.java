package factory.ConcreteProducts;

import factory.ProductInterface.Phone;

public class GamingPhone implements Phone {

    @Override
    public void specs(){
        System.out.println("Gaming Phone: 144Hz display, OLED screen.");
    }
}
