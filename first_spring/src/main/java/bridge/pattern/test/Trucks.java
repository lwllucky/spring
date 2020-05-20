package bridge.pattern.test;

/**
 * @auter liwinallucky
 */
public class Trucks implements Vehicle {
    @Override
    public void driver(String road){
        System.out.println("卡车"+road);
    }
}
