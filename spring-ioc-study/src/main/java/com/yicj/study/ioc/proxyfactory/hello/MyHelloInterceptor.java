package com.yicj.study.ioc.proxyfactory.hello;

import com.yicj.study.foo.model.FxNewsBean;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ClassName: MyHelloInterceptor
 * Description: TODO(描述)
 * Date: 2020/8/4 22:06
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MyHelloInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("客户端代理执.....");
        System.out.println("这里是其他的业务执行...");
        //return "hello world";
        return new FxNewsBean() ;
    }
}