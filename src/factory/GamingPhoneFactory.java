package factory;

public class GamingPhoneFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new GamingPhone();
    }
}
