package bridge.pattern.cainiao;

/**
 * @auter liwinallucky
 */
public class Client {
    public static void main(String[] args) {
        Color white=new White();
        Shape square=new Square();
        square.setColor(white);
        square.draw();

    }
}
