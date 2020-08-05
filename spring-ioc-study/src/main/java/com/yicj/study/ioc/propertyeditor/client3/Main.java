package com.yicj.study.ioc.propertyeditor.client3;

import com.yicj.study.foo.service.FXNewsProvider;
import com.yicj.study.foo.service.impl.DowJonesNewListener;
import com.yicj.study.foo.service.impl.DowJonesNewsPersistent;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/24 22:26
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {

        Object provider = new FXNewsProvider() ;
        Object listener = new DowJonesNewListener() ;
        Object persistent = new DowJonesNewsPersistent() ;

        BeanWrapper newsProvider = new BeanWrapperImpl(provider) ;
        newsProvider.setPropertyValue("newsListener", listener);
        newsProvider.setPropertyValue("newsPersistent", persistent);

        boolean flag1 = newsProvider.getWrappedInstance() instanceof FXNewsProvider ;

        Object wrappedInstance = newsProvider.getWrappedInstance();

        Object newsListener = newsProvider.getPropertyValue("newsListener");

        Object newsPersistent = newsProvider.getPropertyValue("newsPersistent");

        System.out.println(flag1);
        System.out.println(wrappedInstance == provider);
        System.out.println(newsListener == listener);
        System.out.println(newsPersistent == persistent);
    }
}