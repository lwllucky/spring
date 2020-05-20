package spring.com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auter liwinallucky
 */
public class TestSpringSetter {
    public static void main(String[] args) {
//        加载applicationContext.xml配置
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取配置中的adminInfo实例
        AdminInfo admin=(AdminInfo)ctx.getBean("admin");
        admin.print();
    }
}
