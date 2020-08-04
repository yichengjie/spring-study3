package com.yicj.study.ioc.earlysingletonexposure;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: AAA
 * Description: TODO(描述)
 * Date: 2020/7/29 21:32
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class AAA {

    private BBB bbb ;

    public String hello(String name, Integer age){
       log.info("AAA.hello() name: {}, age:{}", name, age);
       return "hello wrold";
    }

    public BBB getBbb() {
        return bbb;
    }
    public void setBbb(BBB bbb) {
        this.bbb = bbb;
    }
}