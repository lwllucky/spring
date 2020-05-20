package DesignMode.StrategyPattern.CaiNiao;

/**
 * @auter liwinallucky
 * 策略模式（Strategy Pattern）
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("a+b="+context.executeOperategy(4,3));
        context=new Context(new OperationSubtract());
        System.out.println("a-b="+context.executeOperategy(4,3));
        context=new Context(new OperationMultiply());
        System.out.println("a*b="+context.executeOperategy(4,3));
    }
}
