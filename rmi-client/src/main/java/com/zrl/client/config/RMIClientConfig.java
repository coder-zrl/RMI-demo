package com.zrl.client.config;

import com.zrl.api.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:27
 * @description
 */
@Configuration
public class RMIClientConfig {
    @Bean
    public RmiProxyFactoryBean getRmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        //去哪里调用
        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2002/userService");
        //返回成哪种接口
        rmiProxyFactoryBean.setServiceInterface(UserService.class);
        return rmiProxyFactoryBean;
    }
}
