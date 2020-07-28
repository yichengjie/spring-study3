package com.yicj.study.ioc.iocimplement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/7/27 21:10
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        String configLocation = "D:\\code\\idea\\spring-study3\\spring-ioc-study\\src\\main\\java\\com\\yicj\\study\\ioc\\iocimplement\\beans.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(configLocation) ;

    }
}