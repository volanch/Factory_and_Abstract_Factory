package abstractFactory.ConcreteProducts.Gaming;

import abstractFactory.AbstractProducts.Laptop;

public class GamingLaptop implements Laptop {
    @Override
    public void specs(){
        System.out.println("Gaming Laptop: RTX graphics, RGB keyboard.");
    }
}
