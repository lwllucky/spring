package bridge.pattern.test;

/**
 * @auter liwinallucky
 */
public abstract class Road {
    Vehicle license;
    public void setLicense(Vehicle license){
        this.license=license;
    }
    public abstract void info();
}
