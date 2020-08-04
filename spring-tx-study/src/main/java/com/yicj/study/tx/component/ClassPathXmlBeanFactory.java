package com.yicj.study.tx.component;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassPathXmlBeanFactory extends DefaultListableBeanFactory {

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