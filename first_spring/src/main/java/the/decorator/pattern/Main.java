package the.decorator.pattern;

/**
 * @auter liwinallucky
 */
public class Main {
    public static void main(String[] args) {
        B1Bed b1=new B1Bed();
        B2Bed b2=new B2Bed();
        System.out.println(b1.getDescription()+"价格:"+b1.getCost());
        System.out.println(b2.getDescription()+"价格:"+b2.getCost());

        Decorator d1=new Mattress();
        d1.setBed(b1);
        System.out.println(d1.getDescription()+"价格:"+d1.getCost());
        d1.setBed(b2);
        System.out.println(d1.getDescription()+"价格:"+d1.getCost());

        d1=new Sheet();
        d1.setBed(b1);
        System.out.println(d1.getDescription()+"价格:"+d1.getCost());
        d1.setBed(b2);
        System.out.println(d1.getDescription()+"价格:"+d1.getCost());
    }
}
