package com.yicj.study.ioc.resourceloader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/1 10:15
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //loadByOriginal() ;
        loadByResourceLoader() ;
    }

    private static void loadByOriginal() throws IOException {
        URL resource = Main.class.getClassLoader().getResource("test.properties");
        String location = resource.getPath();
        System.out.println(location);
        FileInputStream inputStream = new FileInputStream(location) ;
        loadByInputStream(inputStream);
    }

    private static void loadByResourceLoader() throws IOException {
        String location = "classpath*:test.properties";
        PathMatchingResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver() ;
        //DefaultResourceLoader resourceLoader = new DefaultResourceLoader() ;
        Resource[] resources = resourceLoader.getResources(location);
        loadByInputStream(resources[0].getInputStream());
    }

    private static void loadByInputStream(InputStream inputStream) throws IOException {
        try {
            Properties properties = new Properties() ;
            properties.load(inputStream);
            Enumeration<Object> elements = properties.elements();
            while (elements.hasMoreElements()){
                Object value = elements.nextElement();
                System.out.println(value);
            }
        }finally {
            inputStream.close();
        }
    }
}