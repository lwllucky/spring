package the.decorator.pattern;

/**
 * @auter liwinallucky
 */
public class B1Bed extends Bed {
    public B1Bed(){
        cost=180;
        description="1号床";
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
