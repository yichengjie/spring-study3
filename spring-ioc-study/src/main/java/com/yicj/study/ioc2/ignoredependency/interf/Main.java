package com.yicj.study.ioc2.ignoredependency.interf;

import com.yicj.study.component.ClassPathXmlBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/6 9:15
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    //default-autowire="byType" 会扫描setter方法进行注入(所有以set开头的方法都会被扫描)
    public static void main(String[] args) {
        //1. 创建BeanFactory
        ConfigurableListableBeanFactory beanFactory =
                new ClassPathXmlBeanFactory("beans.xml", Main.class) ;
        //2. 执行BeanFactory 后置处理器
        new MyIgnoreProcessor().postProcessBeanFactory(beanFactory);
        //3. 从ioc容器中获取bean
        NewBeanHolder bean = beanFactory.getBean(NewBeanHolder.class);
        System.out.println(bean.getNewsBean());
    }
}