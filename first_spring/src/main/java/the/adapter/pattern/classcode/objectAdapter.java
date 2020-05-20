package the.adapter.pattern.classcode;

/**
 * @auter liwinallucky
 */
public class objectAdapter implements ITarget {
    private Deer deer;
    public objectAdapter(Deer deer){
        this.deer=deer;
    }
    @Override
    public void fly(){
        System.out.println("我会飞了");
    }
    public void run(){
        deer.run();
    }
}
