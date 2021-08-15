package com.zrl.api.service;

import com.zrl.api.pojo.User;

import java.rmi.RemoteException;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:16
 * @description
 */

public interface UserService {
    User findById(Integer id) throws RemoteException;
}
