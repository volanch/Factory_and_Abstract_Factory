package factory;

abstract class SmartphoneFactory {
    public abstract Smartphone createSmartphone();
    public void planSpecs() {
        Smartphone phone = createSmartphone();
        phone.specs();
}
