package spring.com.ssm;

/**
 * @auter liwinallucky
 */
public class HelloSpring {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println(userName+"欢迎学习spring");
    }
}
