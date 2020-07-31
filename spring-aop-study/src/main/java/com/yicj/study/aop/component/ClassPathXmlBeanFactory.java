package com.yicj.study.aop.component;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ClassName: ClassPathXmlBeanFactory
 * Description: TODO(描述)
 * Date: 2020/7/31 14:01
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class ClassPathXmlBeanFactory extends DefaultListableBeanFactory{

    public ClassPathXmlBeanFactory(String configLocation){
        Resource resource = new ClassPathResource(configLocation) ;
        this.load(resource);
    }

    public ClassPathXmlBeanFactory(String configLocation, Class<?> clazz){
        Resource resource = new ClassPathResource(configLocation, clazz) ;
        this.load(resource);
    }

    public ClassPathXmlBeanFactory(Resource resource){
        this.load(resource);
    }

    private void load(Resource resource){
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(this) ;
        xmlBeanDefinitionReader.loadBeanDefinitions(resource) ;
    }
}