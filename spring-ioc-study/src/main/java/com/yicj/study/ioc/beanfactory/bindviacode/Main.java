package com.yicj.study.ioc.beanfactory.bindviacode;

import com.yicj.study.foo.service.FXNewsProvider;
import com.yicj.study.foo.service.impl.DowJonesNewListener;
import com.yicj.study.foo.service.impl.DowJonesNewsPersistent;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/23 20:55
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory() ;
        BeanFactory container = bindViaCode(beanRegistry) ;
        FXNewsProvider newsProvider =
                (FXNewsProvider)container.getBean("djNewsProvider") ;
        newsProvider.getAndPersistNews() ;
    }


    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry){
        AbstractBeanDefinition newsProvider =
                new RootBeanDefinition(FXNewsProvider.class, true) ;
        AbstractBeanDefinition newsListener =
                new RootBeanDefinition(DowJonesNewListener.class,true) ;
        AbstractBeanDefinition newPersistent =
                new RootBeanDefinition(DowJonesNewsPersistent.class, true) ;
        // 将bean定义注册到容器
        registry.registerBeanDefinition("djNewsProvider", newsProvider);
        registry.registerBeanDefinition("djNewsListener", newsListener);
        registry.registerBeanDefinition("djNewPersistent", newPersistent);
        // 指定依赖关系
        // 可以通过构造方法注入
        ConstructorArgumentValues argValues = new ConstructorArgumentValues() ;
        argValues.addIndexedArgumentValue(0, newsListener);
        argValues.addIndexedArgumentValue(1, newPersistent);
        newsProvider.setConstructorArgumentValues(argValues);
        // 或者通过setter方式注入
        MutablePropertyValues propertyValues = new MutablePropertyValues() ;
        propertyValues.addPropertyValue(new PropertyValue("newsListener", newsListener)) ;
        propertyValues.addPropertyValue(new PropertyValue("newsPersistent", newPersistent)) ;
        newsProvider.setPropertyValues(propertyValues);
        // 绑定完成
        return (BeanFactory) registry ;
    }

}