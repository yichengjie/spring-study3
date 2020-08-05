package com.yicj.study.ioc.createbeanviacode;

import com.yicj.study.foo.service.FXNewsProvider;
import com.yicj.study.foo.service.IFXNewsListener;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/1 17:14
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        //AutowireCapableBeanFactory
        String configLocation = "beans.xml" ;
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation, Main.class) ;
        AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
        FXNewsProvider provider  = beanFactory.createBean(FXNewsProvider.class);
        System.out.println("====> " + provider);
        IFXNewsListener newsListener = provider.getNewsListener();
        System.out.println("====> " + newsListener);
        //Object fXNewsProvider = context.getBean("fXNewsProvider");
        //System.out.println(fXNewsProvider);
    }
}