package com.yicj.study.foo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Constructor;

/**
 * ClassName: TXProxyFactoryBean
 * Description: TODO(描述)
 * Date: 2020/7/29 20:04
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class TXProxyFactoryBean implements FactoryBean<Object> {

    private String clazzName ;

    @Override
    public Object getObject() throws Exception {

        Class<?> clazz = ClassUtils.forName(clazzName, ClassUtils.getDefaultClassLoader()) ;
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }
}