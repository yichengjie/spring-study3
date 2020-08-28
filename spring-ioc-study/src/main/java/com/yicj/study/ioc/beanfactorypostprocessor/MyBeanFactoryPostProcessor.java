package com.yicj.study.ioc.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;

/**
 * ClassName: MyBeanFactoryPostProcessor
 * Description: TODO(描述)
 * Date: 2020/8/28 22:00
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition newsListener = beanFactory.getBeanDefinition("newsListener");
        MutablePropertyValues propertyValues = newsListener.getPropertyValues();
        PropertyValue propertyValue = propertyValues.getPropertyValue("password");
        String password = ((TypedStringValue)propertyValue.getValue()).getValue() ;
        String newPassword = password +"_123" ;
        propertyValues.add("password", newPassword) ;
    }
}