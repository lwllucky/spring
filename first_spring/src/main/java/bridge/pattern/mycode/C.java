package bridge.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class C implements License {
    @Override
    public void driver(String type){
        System.out.println("C级驾驶员驾驶"+type);
    }
}
