package spring.aop.com.ssm.service.impl;

import spring.aop.com.ssm.service.ProductService;

/**
 * @auter liwinallucky
 */
public class ProductServiceImpl implements ProductService {
    //实现方法browse，模拟某用户浏览某产品
    @Override
    public void browse(String loginName,String ProductName){
        System.out.println("执行业务方法browse");
    }
}
