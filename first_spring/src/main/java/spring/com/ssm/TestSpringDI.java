package spring.com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.com.ssm.service.UserService;

/**
 * @auter liwinallucky
 */
public class TestSpringDI {
    public static void main(String[] args) {
//        加载applicationContext.xml配置
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取配置中UserServiceImpl实例
        UserService userService=(UserService)ctx.getBean("userService");
        boolean flag=userService.login("liwinal","123456");
        if(flag){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
