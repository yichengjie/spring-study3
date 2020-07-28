package com.yicj.study.mvc.hello;

import com.yicj.study.mvc.foo.service.FXNewsProvider;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/27 10:31
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("beans.xml", Main.class) ;

        DefaultListableBeanFactory beanFactory = new XmlBeanFactory(resource) ;

        FXNewsProvider newsProvider = beanFactory.getBean("newsProvider", FXNewsProvider.class);

        System.out.println(newsProvider);

    }

}