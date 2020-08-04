package com.yicj.study.tx.hello;

import com.yicj.study.tx.hello.model.User;
import com.yicj.study.tx.hello.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/4 12:49
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml", Main.class) ;
        UserService userService = (UserService) beanFactory.getBean("userServiceProxy");

        userService.insertUser(new User());
    }
}