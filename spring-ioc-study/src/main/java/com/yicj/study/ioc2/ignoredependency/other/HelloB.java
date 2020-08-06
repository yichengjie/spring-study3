package com.yicj.study.ioc2.ignoredependency.other;

import org.springframework.beans.factory.BeanNameAware;

/**
 * ClassName: HelloB
 * Description: TODO(描述)
 * Date: 2020/8/5 21:02
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class HelloB /*implements BeanNameAware */{

    private String addr ;

  /*  @Override
    public void setBeanName(String name) {

        this.addr = name ;
    }*/


    public void hello(){
        System.out.println("addr : " +addr);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}