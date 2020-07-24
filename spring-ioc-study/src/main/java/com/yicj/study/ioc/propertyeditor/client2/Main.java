package com.yicj.study.ioc.propertyeditor.client2;

import com.yicj.study.ioc.propertyeditor.DateFoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/24 22:12
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        String configLocation = "com/yicj/study/ioc/propertyeditor/client2/beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;
        DateFoo bean = context.getBean(DateFoo.class);
        System.out.println(bean);
    }
}