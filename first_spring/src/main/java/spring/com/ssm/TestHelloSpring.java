package spring.com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auter liwinallucky
 */
public class TestHelloSpring {
    public static void main(String[] args) {
//        初始化spring容器，加载applicationContext.xml配置
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取配置中helloSpring的实例
        HelloSpring helloSpring=(HelloSpring)ctx.getBean("helloSpring");//没有通过new创建对象，而是通过spring容器获取实现类对象
        helloSpring.show();
    }
}
