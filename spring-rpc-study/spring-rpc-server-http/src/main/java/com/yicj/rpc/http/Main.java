package com.yicj.rpc.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/4 21:00
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
       /* IUserService userService = context.getBean(IUserService.class) ;
        User user = new User() ;
        user.setUsername("李四");
        user.setAddr("shanghai");
        User dbUser = userService.saveUser(user);
        log.info("db user info : {}", dbUser);*/
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine();
        log.info("=====> {}", s);
    }
}