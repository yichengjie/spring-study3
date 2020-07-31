package com.yicj.study.aop.hotswap;

import com.yicj.study.aop.advice.CountingBeforeAdvice;
import com.yicj.study.aop.foo.IHello;
import com.yicj.study.aop.foo.impl.HelloImpl;
import com.yicj.study.aop.foo.impl.HelloImpl2;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.HotSwappableTargetSource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/31 20:57
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        IHello target = new HelloImpl() ;
        HotSwappableTargetSource targetSource = new HotSwappableTargetSource(target) ;

        CountingBeforeAdvice beforeAdvice  = new CountingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory() ;
        // 指定针对接口代理
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setTargetSource(targetSource);
        pf.addAdvice(beforeAdvice);

        IHello proxy = (IHello) pf.getProxy();
        proxy.hello("张三") ;
        // 热替换对象
        targetSource.swap(new HelloImpl2()) ;
        proxy.hello("李四") ;
    }
}