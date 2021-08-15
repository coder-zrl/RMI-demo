package com.zrl.server.config;

import com.zrl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:21
 * @description
 */
@Configuration
public class RMIServerConfig {
    @Autowired
    UserService userService;
    @Bean
    public RmiServiceExporter getRmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        //暴露的服务名
        rmiServiceExporter.setServiceName("userService");
        rmiServiceExporter.setService(userService);
        rmiServiceExporter.setServiceInterface(UserService.class);
        //暴露的端口
        rmiServiceExporter.setRegistryPort(2002);
        return rmiServiceExporter;
    }
}
