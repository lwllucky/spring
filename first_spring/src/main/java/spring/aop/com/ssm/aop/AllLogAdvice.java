package spring.aop.com.ssm.aop;

import org.aspectj.lang.JoinPoint;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @auter liwinallucky
 * 编写用于生成日志记录的方法myBeforeAdvice
 */
public class AllLogAdvice {
    //此方法将作为前置通知
    public void myBeforeAdvice(JoinPoint joinPoint){
        //获取业务方法参数
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        //日志格式字符串
        String logInfoText="前置通知:"
                +new SimpleDateFormat("YYYY-MM-dd HH:mm:ss")
                .format(new Date())+" "+args.get(0).toString()
                +"浏览商品"+args.get(1).toString();
        //将日志信息输出到控制台
        System.out.println(logInfoText);
    }
}
