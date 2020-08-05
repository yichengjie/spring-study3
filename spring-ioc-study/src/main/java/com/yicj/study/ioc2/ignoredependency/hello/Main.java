package com.yicj.study.ioc2.ignoredependency.hello;

import com.yicj.study.ioc2.ignoredependency.other.HelloB;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
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
}