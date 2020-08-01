package com.yicj.study.ioc.annoconfapplicationcontext;

import com.yicj.study.ioc.foo.config.AppBeanConfiguration;
import com.yicj.study.ioc.foo.service.FXNewsProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/1 21:33
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        testAnno() ;
    }


    private static void testAnno(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppBeanConfiguration.class);
        FXNewsProvider newsProvider = (FXNewsProvider)context.getBean("newsProvider");
        System.out.println(newsProvider);
        System.out.println(newsProvider.getNewsListener());
        System.out.println(newsProvider.getNewsPersistent());
    }

    private static void testRegister(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppBeanConfiguration.class);
        // application.scan("com.yicj.study") ;
        // must use refresh() method
        context.refresh();
        FXNewsProvider newsProvider = (FXNewsProvider)context.getBean("newsProvider");

        System.out.println(newsProvider);
        System.out.println(newsProvider.getNewsListener());
        System.out.println(newsProvider.getNewsPersistent());
    }
}