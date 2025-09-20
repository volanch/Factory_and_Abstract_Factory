package abstractFactory;

class GamingElectronicsFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new GamingPhone();
    }
    @Override
    public Laptop createLaptop() {
        return new GamingLaptop();
    }
}
