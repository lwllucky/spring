package the.adapter.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class objectAdapter implements ITarget {
    Chook chook;
    public objectAdapter(Chook chook){
        this.chook=chook;
    }
    @Override
    public void combat(){
        System.out.println("我是战斗鸡，咯咯哒！！");
    }
    public void eat(){
        chook.eat();
    }
}
