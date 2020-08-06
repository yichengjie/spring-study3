package com.yicj.study.ioc2.ignoredependency.type;

import com.yicj.study.component.ClassPathXmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/5 21:01
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {

        ConfigurableListableBeanFactory beanFactory = new ClassPathXmlBeanFactory("beans.xml", Main.class) ;
        // beanFactory post processor执行
        IgnoreAutowiringProcessor processor = new IgnoreAutowiringProcessor() ;
        processor.postProcessBeanFactory(beanFactory);

        ListHolder bean = beanFactory.getBean(ListHolder.class);

        System.out.println(bean.getList());
    }
}