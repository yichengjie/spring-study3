package com.yicj.study.ioc.factorymethod.factorybean;

import org.joda.time.DateTime;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: NextDayDateFactoryBean
 * Description: TODO(描述)
 * Date: 2020/7/24 10:22
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class NextDayDateFactoryBean implements FactoryBean<DateTime> {

    @Override
    public DateTime getObject() throws Exception {
        DateTime currentDate = new DateTime();
        return currentDate.plusDays(1);
    }

    /**
     * getObjectType返回getObject()方法所返回的对象的类型
     * 如果预先无法确定，则返回null
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}