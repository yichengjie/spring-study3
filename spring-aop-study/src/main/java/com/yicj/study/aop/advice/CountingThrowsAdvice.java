package com.yicj.study.aop.advice;

import com.yicj.study.aop.component.MethodCounter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.ThrowsAdvice;

import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * ClassName: CountingThrowsAdvice
 * Description: TODO(描述)
 * Date: 2020/7/30 10:36
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class CountingThrowsAdvice extends MethodCounter implements ThrowsAdvice {

    // ThrowsAdvice没有指定需要实现的接口方法，它在抛出异常时被调用，这个回调是aop使用反射机制来完成的。
    public void afterThrowing(IOException ex) throws Throwable{
        count(IOException.class.getName());
    }

    public void afterThrowing(UncheckedIOException ex) throws Throwable{
        log.info("=====> throws advice executed !");
        count(UncheckedIOException.class.getName());
    }
}