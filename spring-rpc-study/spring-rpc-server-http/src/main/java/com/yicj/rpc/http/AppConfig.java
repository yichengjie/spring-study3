package com.yicj.rpc.http;

import com.yicj.rpc.remote.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

/**
 * ClassName: AppConfig
 * Description: TODO(描述)
 * Date: 2020/8/4 21:02
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@ComponentScan("com.yicj.rpc.remote")
@Configuration
public class AppConfig {

    @Autowired
    private IUserService userService ;

    @Bean(name = "userServiceRemote")
    public HttpInvokerServiceExporter httpInvokerServiceExporter(){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter() ;
        exporter.setService(userService);
        exporter.setServiceInterface(IUserService.class);
        return exporter ;
    }

    @Bean
    public SimpleUrlHandlerMapping handlerMapping(){
        Properties properties = new Properties() ;
        properties.setProperty("/user/userService", "userServiceRemote") ;
        SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping() ;
        handlerMapping.setMappings(properties);
        return handlerMapping ;
    }

}