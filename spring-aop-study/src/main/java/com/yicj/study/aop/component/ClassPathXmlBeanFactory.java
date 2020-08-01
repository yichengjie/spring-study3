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
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(this) ;
        reader.loadBeanDefinitions(configLocation) ;
    }

    public ClassPathXmlBeanFactory(String configLocation, Class<?> clazz){
        ClassPathResource resource = new ClassPathResource(configLocation, clazz) ;
        this.loadByResource(resource);
    }

    public ClassPathXmlBeanFactory(Resource resource){
        this.loadByResource(resource);
    }

    private void loadByResource(Resource resource){
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(this) ;
        reader.loadBeanDefinitions(resource) ;
    }
}