package bridge.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class B implements License {
    @Override
    public void driver(String type){
        System.out.println("B级驾驶员驾驶"+type);
    }
}
