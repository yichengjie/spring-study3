package com.yicj.study.jdbc.mutidatasource.client1;

import com.yicj.study.jdbc.mutidatasource.DataSourceType;
import com.yicj.study.jdbc.mutidatasource.DataSourceTypeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

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

    public static void main(String[] args) throws SQLException {
        execute("beans.xml", Main.class);
    }


    public static ApplicationContext execute(String beanName, Class<?> mainClazz) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext(beanName, mainClazz) ;
        DataSourceTypeManager.set(DataSourceType.MAIN) ;
        DataSource mainDatasource = (DataSource)context.getBean("dataSource");
        String mainCatalog = mainDatasource.getConnection().getCatalog() ;
        System.out.println(mainCatalog);

        DataSourceTypeManager.set(DataSourceType.INFO) ;
        DataSource infoDatasource = (DataSource)context.getBean("dataSource");
        String infoCatalog = infoDatasource.getConnection().getCatalog() ;
        System.out.println(infoCatalog);

        DataSourceTypeManager.set(DataSourceType.DBLINK) ;
        DataSource dbLinkDasource = (DataSource)context.getBean("dataSource");
        String dbLinkCatalog = dbLinkDasource.getConnection().getCatalog() ;
        System.out.println(dbLinkCatalog);
        return context ;
    }
}