package com.yicj.study.ioc2.ignoredependency.interf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ClassName: MyIgnoreProcessor
 * Description: TODO(描述)
 * Date: 2020/8/6 9:32
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MyIgnoreProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {

        beanFactory.ignoreDependencyInterface(FxNewBeanAware.class);
    }
}