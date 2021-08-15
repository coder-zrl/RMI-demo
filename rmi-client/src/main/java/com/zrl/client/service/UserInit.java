package com.zrl.client.service;

import com.zrl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:26
 * @description
 */
@Service
public class UserInit implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Override
    public void run(String... args) throws Exception {
        //调用的时候控制台会打印
        System.out.println(userService.findById(2));
    }
}
