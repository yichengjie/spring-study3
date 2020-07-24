package com.yicj.study.ioc.factorymethod.factorybean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/24 10:46
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/yicj/study/ioc/factorymethod/factorybean/beans.xml") ;
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory() ;
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory) ;
        reader.loadBeanDefinitions(resource) ;

        NextDayDateDisplayer bean = beanFactory.getBean(NextDayDateDisplayer.class);
        System.out.println(bean.getDateofNextDay());
    }
}