package bridge.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class Main {
    public static void main(String[] args) {
        License license=new A();
        Type type=new MoterBus();
        type.setLicense(license);
        type.info();
        license=new B();
        type=new MediumBus();
        type.setLicense(license);
        type.info();
        license=new C();
        type=new Car();
        type.setLicense(license);
        type.info();
    }
}
