package com.yicj.study.foo;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MethodCounter
 * Description: TODO(描述)
 * Date: 2020/7/30 10:14
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MethodCounter implements Serializable {

    // 这个map用来存储方法名和调用次数的键值对
    private Map<String, Integer> map = new HashMap<>() ;
    // 所有的调用次数，不管使用什么方法名
    private int allCount ;
    // CountingBeforeAdvice的调用入口
    protected void count(Method method){
        count(method.getName());
    }

    // 根据目标方法的方法名统计调用次数
    protected void count(String methodName){
        Integer i = map.get(methodName);
        i = (i != null) ? new Integer(i + 1) : new Integer(1) ;
        map.put(methodName, i) ;
        allCount ++ ;
    }

    // 根据方法名取得调用次数
    public int getCalls(String methodName){
        Integer i = map.get(methodName);
        return (i != null ? i : 0) ;
    }

    // 取得所有的方法调用次数
    public int getCalls(){
        return allCount ;
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && other.getClass() == this.getClass()) ;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode() ;
    }
}