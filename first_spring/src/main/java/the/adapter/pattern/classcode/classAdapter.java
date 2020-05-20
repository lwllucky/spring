package the.adapter.pattern.classcode;

/**
 * @auter liwinallucky
 */
public class classAdapter extends Deer implements ITarget{
    @Override
    public void fly(){
        System.out.println("我可以飞！！");
    }
}
