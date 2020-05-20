package the.decorator.pattern;

/**
 * @auter liwinallucky
 */
public class Decorator extends Bed{
    protected Bed bed;
    protected int DecoratorCost;
    protected String DecoratorDescription;
    public void setBed(Bed bed){
        this.bed=bed;
    }
    @Override
    public int getCost() {
        return bed.cost+DecoratorCost;
    }
    @Override
    public String getDescription() {
        return bed.description+DecoratorDescription;
    }

}
