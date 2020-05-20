package the.adapter.pattern.classcode;

/**
 * @auter liwinallucky
 */
public class Program {
    public static void main(String[] args) {
        ITarget flyDeer=new objectAdapter(new Deer());
        ITarget flyDeer1=new classAdapter();
        flyDeer.run();
        flyDeer.fly();
        flyDeer1.run();
        flyDeer1.fly();
    }
}
