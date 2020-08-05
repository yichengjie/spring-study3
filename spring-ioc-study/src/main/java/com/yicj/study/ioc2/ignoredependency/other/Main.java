package com.yicj.study.ioc2.ignoredependency.other;

import com.yicj.study.component.ClassPathXmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;

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

        BeanFactory beanFactory = new ClassPathXmlBeanFactory("beans.xml", Main.class) ;

        HelloB bean = beanFactory.getBean(HelloB.class);

        bean.hello();
    }
}