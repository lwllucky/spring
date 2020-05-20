package bridge.pattern.test;

/**
 * @auter liwinallucky
 */
public class Main {
    public static void main(String[] args) {
        Vehicle license=new Bus();
        Road road=new NationalHighway();
        road.setLicense(license);
        road.info();
        license=new Trucks();
        road=new ProvincialHighway();
        road.setLicense(license);
        road.info();
        license=new Car();
        road=new Expressway();
        road.setLicense(license);
        road.info();
    }
}
