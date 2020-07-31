package com.yicj.study.aop.advice;

import com.yicj.study.aop.component.MethodCounter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

/**
 * ClassName: CountingAfterAdvice
 * Description: TODO(描述)
 * Date: 2020/7/31 14:30
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class CountingAfterAdvice extends MethodCounter implements AfterReturningAdvice {

    /**
     * 0 = {MethodBeforeAdviceAdapter@1678}
     * 1 = {AfterReturningAdviceAdapter@1681}
     * 2 = {ThrowsAdviceAdapter@1682}
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("=====> after return advice executed !");
        count(method);
    }
}