package com.zrl.server.service;

import com.zrl.api.pojo.User;
import com.zrl.api.service.UserService;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:19
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Integer id) throws RemoteException {
        User user = new User();
        user.setId(id);
        user.setUsername("张三");
        System.out.println("提供服务方接收到用户id为"+id);
        return user;
    }
}
