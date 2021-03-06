package com.yicj.study.aop.foo.impl;

import com.yicj.study.aop.foo.IHello;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: HelloImpl
 * Description: TODO(描述)
 * Date: 2020/7/31 10:44
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class HelloImpl implements IHello {
    @Override
    public String hello(String name) {
        log.info("hello 111111 {}", name);
        return "hello 111111 " + name;
    }
}