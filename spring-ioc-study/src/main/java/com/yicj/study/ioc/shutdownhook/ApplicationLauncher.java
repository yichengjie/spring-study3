package com.yicj.study.ioc.shutdownhook;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: ApplicationLauncher
 * Description: TODO(描述)
 * Date: 2020/7/25 16:26
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class ApplicationLauncher {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        BeanFactory container = new ClassPathXmlApplicationContext("beans.xml", ApplicationLauncher.class) ;

        ((AbstractApplicationContext) container).registerShutdownHook();
        BusinessObject bean = (BusinessObject)container.getBean("businessObject") ;
        bean.doSth();
        // 应用程序退出，容器关闭
    }
}