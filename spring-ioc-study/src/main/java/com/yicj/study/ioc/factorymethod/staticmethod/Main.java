package com.yicj.study.ioc.factorymethod.staticmethod;

import com.yicj.study.ioc.factorymethod.Foo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/24 11:01
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/yicj/study/ioc/factorymethod/staticmethod/beans.xml") ;
        BeanFactory beanFactory = new XmlBeanFactory(resource) ;
        Foo bean = beanFactory.getBean(Foo.class);
        System.out.println(bean);
    }
}