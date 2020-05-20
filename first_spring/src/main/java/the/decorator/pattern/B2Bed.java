package the.decorator.pattern;

/**
 * @auter liwinallucky
 */
public class B2Bed extends Bed {
    public B2Bed(){
        cost=250;
        description="2号床";
    }
    @Override
    public String getDescription(){
        return description;
    }
    @Override
    public int getCost(){
        return cost;
    }
}
