package the.adapter.pattern.mycode;

/**
 * @auter liwinallucky
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("类的适配器模式举例：");
        ITarget chook1=new classAdapter();
        chook1.eat();
        chook1.combat();
        System.out.println("对象的适配器模式举例：");
        ITarget chook2=new objectAdapter(new Chook());
        chook2.eat();
        chook2.combat();
    }
}
