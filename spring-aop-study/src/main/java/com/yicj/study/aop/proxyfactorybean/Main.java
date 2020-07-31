package com.yicj.study.aop.proxyfactorybean;

import com.yicj.study.aop.component.ClassPathXmlBeanFactory;
import com.yicj.study.aop.component.MethodCounter;
import com.yicj.study.aop.foo.IHello;
import org.springframework.beans.factory.BeanFactory;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/31 13:49
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlBeanFactory("beans.xml", Main.class) ;
        Object testAop = beanFactory.getBean("testAop");
        MethodCounter methodCounter = beanFactory.getBean("testAdvice", MethodCounter.class);
        System.out.println("method count : " + methodCounter.getCalls());
        ((IHello)testAop).hello("张三") ;
        System.out.println("method count : " + methodCounter.getCalls());
        ((IHello)testAop).hello("李四") ;
        System.out.println("method count : " + methodCounter.getCalls());
    }
}