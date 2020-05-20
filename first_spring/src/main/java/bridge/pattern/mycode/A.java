package bridge.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class A implements License {
    @Override
    public void driver(String type){
        System.out.println("A级驾驶员驾驶"+type);
    }
}
