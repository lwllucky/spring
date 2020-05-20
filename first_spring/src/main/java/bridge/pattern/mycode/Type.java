package bridge.pattern.mycode;

/**
 * @auter liwinallucky
 */
public abstract class Type {
    License license;
    public void setLicense(License license){
        this.license=license;
    }
    public abstract void info();
}
