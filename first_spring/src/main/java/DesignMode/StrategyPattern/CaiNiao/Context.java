package DesignMode.StrategyPattern.CaiNiao;

/**
 * @auter liwinallucky
 * 策略模式（Strategy Pattern）
 * execute 实行，执行
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeOperategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }


}
