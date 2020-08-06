package com.yicj.study.ioc2.ignoredependency.hello;

import com.yicj.study.ioc2.ignoredependency.interf.NewBeanHolder;
import com.yicj.study.ioc2.ignoredependency.other.HelloB;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/5 22:04
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        test2() ;
    }

    public static void test1(){
        //AbstractBeanDefinition mbd = BeanDefinitionBuilder.rootBeanDefinition(HelloB.class).getRawBeanDefinition();
        // PropertyValues pvs = mbd.getPropertyValues();
        HelloB helloB = new HelloB() ;
        BeanWrapper bw = new BeanWrapperImpl(helloB) ;
        PropertyDescriptor[] pds = bw.getPropertyDescriptors();

        for (PropertyDescriptor pd : pds) {
            Method wm = pd.getWriteMethod();
            System.out.println(wm !=null ? wm.getName() : null);
        }
    }


    public static void test2(){
        NewBeanHolder holder = new NewBeanHolder() ;
        Class<?> beanClass = holder.getClass() ;
        String name = "newsBean";
        Method candidate = ClassUtils.getMethodIfAvailable(
                beanClass, "set" + StringUtils.capitalize(name), (Class<?>[]) null);

        System.out.println(candidate);
    }
}