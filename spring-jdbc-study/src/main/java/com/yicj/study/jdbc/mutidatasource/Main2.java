package com.yicj.study.jdbc.mutidatasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ClassName: Main2
 * Description: TODO(描述)
 * Date: 2020/7/25 22:24
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main2 {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml", Main.class) ;
        DataSourceTypeManager.set(DataSourceType.MAIN) ;
        DataSource mainDatasource = (DataSource)context.getBean("dataSource");
        String mainCatalog = mainDatasource.getConnection().getCatalog() ;
        System.out.println(mainCatalog);
    }
}