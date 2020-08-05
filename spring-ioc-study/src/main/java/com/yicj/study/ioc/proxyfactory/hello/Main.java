package com.yicj.study.ioc.proxyfactory.hello;

import com.yicj.study.foo.model.FxNewsBean;
import com.yicj.study.ioc.proxyfactory.hello.service.IHello;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.util.ClassUtils;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/4 22:05
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        MyHelloInterceptor interceptor = new MyHelloInterceptor() ;
        ClassLoader defaultClassLoader = ClassUtils.getDefaultClassLoader();
        IHello helloProxy = (IHello) new ProxyFactory(IHello.class, interceptor).getProxy(defaultClassLoader);
        FxNewsBean retInfo = helloProxy.hello();
        System.out.println(retInfo);
    }
}