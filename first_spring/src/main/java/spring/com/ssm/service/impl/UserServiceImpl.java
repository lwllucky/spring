package spring.com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.com.ssm.dao.UserDao;
import spring.com.ssm.service.UserService;

/**
 * @auter liwinallucky
 */
@Service("userService")//用于业务层（service层），标识spring中的bean。
public class UserServiceImpl implements UserService {
    //使用接口UserDao声明对象，添加setter方法，用于依赖注入
    @Autowired
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean login(String loginName,String loginPwd){
//        调用UserDao里面的login方法
        return userDao.login(loginName,loginPwd);
    }
}
