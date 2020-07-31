package com.yicj.study.aop.proxyfactory;

import com.yicj.study.aop.advice.CountingAfterAdvice;
import com.yicj.study.aop.advice.CountingBeforeAdvice;
import com.yicj.study.aop.advice.CountingThrowsAdvice;
import com.yicj.study.aop.foo.IHello;
import com.yicj.study.aop.foo.impl.HelloImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/31 10:35
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        IHello target = new HelloImpl() ;
        CountingBeforeAdvice beforeAdvice  = new CountingBeforeAdvice();
        CountingAfterAdvice afterAdvice  = new CountingAfterAdvice();
        CountingThrowsAdvice throwsAdvice  = new CountingThrowsAdvice();

        DefaultPointcutAdvisor beforeAdvisor = new DefaultPointcutAdvisor(beforeAdvice) ;
        ProxyFactory pf = new ProxyFactory() ;
        // 指定针对接口代理
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setTarget(target);
        pf.addAdvisor(beforeAdvisor);
        pf.addAdvice(afterAdvice);
        pf.addAdvice(throwsAdvice);

        IHello proxy = (IHello) pf.getProxy();
        proxy.hello("张三") ;
//        proxy.hello("李四") ;
//        proxy.hello("王五") ;
//        proxy.hello("赵六") ;


        int calls = beforeAdvice.getCalls();
        System.out.println("所有方法调用总和：" + calls);
    }
}