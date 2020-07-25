package com.yicj.study.ioc.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/25 15:59
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        String configLocation = "com/yicj/study/ioc/beanpostprocessor/beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;
        DowJonesNewsListener newsListener = (DowJonesNewsListener)context.getBean("newsListener") ;
        String password = newsListener.getPassword();
        System.out.println(password);
    }
}