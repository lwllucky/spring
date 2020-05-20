package spring.com.ssm.dao.impl;

import spring.com.ssm.dao.UserDao;

/**
 * @auter liwinallucky
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String loginName,String loginPwd){
        if(loginName.equals("liwinal")&&loginPwd.equals("123456")){
            return true;
        }
        return false;
    }
}
