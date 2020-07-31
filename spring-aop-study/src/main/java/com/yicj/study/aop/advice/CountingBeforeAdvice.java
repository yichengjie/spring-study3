package com.yicj.study.aop.advice;

import com.yicj.study.aop.component.MethodCounter;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * ClassName: CountingBeforeAdvice
 * Description: TODO(描述)
 * Date: 2020/7/30 10:26
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {
    // 实现before回调接口，这是接口MethodBeforeAdvice的要求
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        count(method);
    }
}