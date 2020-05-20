package test;

import entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auter liwinallucky
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        People people=(People)ac.getBean("people");
        System.out.println(people);

        People people2=(People)ac.getBean("people2");
        System.out.println(people2);

        People people3=(People)ac.getBean("people3");
        System.out.println(people3);
    }
}
