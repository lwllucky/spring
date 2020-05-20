package DesignMode.StrategyPattern.CaiNiao;

/**
 * @auter liwinallucky
 * 策略模式（Strategy Pattern）
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1,int num2){
        return num1*num2;
    }
}
