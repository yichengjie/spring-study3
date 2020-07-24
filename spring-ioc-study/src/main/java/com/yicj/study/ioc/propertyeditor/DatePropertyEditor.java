package com.yicj.study.ioc.propertyeditor;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * ClassName: DatePropertyEditor
 * Description: TODO(描述)
 * Date: 2020/7/24 21:37
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Getter
@Setter
public class DatePropertyEditor extends PropertyEditorSupport {
    private String datePattern ;

    // 如果仅仅是想支持从单向的String到相应对象类型的转换，只要覆写方法setAsText即可，
    // 如果想要支持双向转换，需要同时考虑getAsText方法的覆写
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern(getDatePattern());
        Date date = formatter.parseDateTime(text).toDate();
        setValue(date);
    }
}