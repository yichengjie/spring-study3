package com.yicj.study.ioc.factorymethod.factorybean;

import org.joda.time.DateTime;

/**
 * ClassName: NextDayDateDisplayer
 * Description: TODO(描述)
 * Date: 2020/7/24 10:41
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class NextDayDateDisplayer {

    private DateTime dateofNextDay ;

    public DateTime getDateofNextDay() {
        return dateofNextDay;
    }

    public void setDateofNextDay(DateTime dateofNextDay) {
        this.dateofNextDay = dateofNextDay;
    }
}