package abstractFactory;

public class GamingLaptop implements Laptop {
    @Override
    public void specs(){
        System.out.println("Gaming Laptop: RTX graphics, RGB keyboard.");
    }
}
