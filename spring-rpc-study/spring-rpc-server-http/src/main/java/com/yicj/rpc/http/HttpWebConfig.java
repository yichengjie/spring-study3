package com.yicj.rpc.http;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

/**
 * ClassName: HttpWebConfig
 * Description: TODO(描述)
 * Date: 2020/8/4 21:26
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Controller
@Configuration
@EnableWebMvc
public class HttpWebConfig {



    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello world" ;
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