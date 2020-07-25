package com.yicj.study.jdbc.mutidatasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/25 20:56
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", Main.class) ;
        DataSourceTypeManager.set(DataSourceType.MAIN) ;
        Object mainDatasource = context.getBean("dataSource");
        System.out.println(mainDatasource);

        DataSourceTypeManager.set(DataSourceType.INFO) ;
        Object infoDatasource = context.getBean("dataSource");
        System.out.println(infoDatasource);

        DataSourceTypeManager.set(DataSourceType.DBLINK) ;
        Object dbLinkDasource = context.getBean("dataSource");
        System.out.println(dbLinkDasource);
    }
}