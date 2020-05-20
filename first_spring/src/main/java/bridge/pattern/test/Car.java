package bridge.pattern.test;

/**
 * @auter liwinallucky
 */
public class Car implements Vehicle {
    @Override
    public void driver(String road){
        System.out.println("小轿车在"+road);
    }
}
