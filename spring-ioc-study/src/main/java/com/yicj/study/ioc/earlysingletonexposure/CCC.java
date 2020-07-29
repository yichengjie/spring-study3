package com.yicj.study.ioc.earlysingletonexposure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName: CCC
 * Description: TODO(描述)
 * Date: 2020/7/29 21:33
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class CCC implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("aaa")){
            //返回一个新的代理对象
            return new CGLIBProxy(bean).createProxy() ;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }



    public static class CGLIBProxy implements MethodInterceptor {
        private Object target ;

        public CGLIBProxy(Object target){
            this.target = target ;
        }

        public Object createProxy(){
            Enhancer enhancer = new Enhancer() ;
            enhancer.setSuperclass(target.getClass());
            enhancer.setCallback(this);
            return enhancer.create();
        }


        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            log.info("----{} 方法开始", method.getName());
            //Object ret = method.invoke(target, args) ;
            Object ret = methodProxy.invokeSuper(o, args);
            log.info("----{} 方法结束", method.getName());
            return ret;
        }
    }

    public static void main(String[] args) {
        //System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true") ;
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code\\idea\\spring-study3\\spring-ioc-study\\");
        AAA aaa = new AAA() ;
        Object proxy = new CGLIBProxy(aaa).createProxy();
        ((AAA)proxy).hello();
    }
}