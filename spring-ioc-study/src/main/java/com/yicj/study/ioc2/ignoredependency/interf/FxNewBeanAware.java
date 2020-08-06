package com.yicj.study.ioc2.ignoredependency.interf;

import com.yicj.study.foo.model.FxNewsBean;

/**
 * ClassName: FxNewBeanAware
 * Description: TODO(描述)
 * Date: 2020/8/6 9:34
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface FxNewBeanAware {

    void setNewsBean(FxNewsBean newsBean) ;
}