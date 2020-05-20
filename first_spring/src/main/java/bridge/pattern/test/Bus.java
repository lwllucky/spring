package bridge.pattern.test;

/**
 * @auter liwinallucky
 */
public class Bus implements Vehicle {
    @Override
    public void driver(String road){
        System.out.println("公交车在"+road);
    }
}
