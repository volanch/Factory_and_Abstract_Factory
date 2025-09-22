package abstractFactory.ConcreteProducts.Gaming;

import abstractFactory.AbstractProducts.Phone;

public class GamingPhone implements Phone {
    @Override
    public void specs() {
        System.out.println("Gaming Phone: 144Hz display, OLED screen.");
    }
}
