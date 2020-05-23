package spring.aop.com.ssm.service;

/**
 * @auter liwinallucky
 */
public interface ProductService {
    //定义抽象方法browse，模拟某用户浏览某产品
    public void browse(String loginName,String ProductName);
}
