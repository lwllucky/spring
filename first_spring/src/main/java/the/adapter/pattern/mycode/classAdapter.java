package the.adapter.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class classAdapter extends Chook implements ITarget {
    @Override
    public void combat(){
        System.out.println("这一天，我学会了战斗！！");
    }
}
