package com.yicj.study.ioc2.ignoredependency.interf;

import com.yicj.study.foo.model.FxNewsBean;

/**
 * ClassName: NewBeanHolder
 * Description: TODO(描述)
 * Date: 2020/8/6 9:12
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class NewBeanHolder implements FxNewBeanAware {

    private FxNewsBean newsBean ;

    public FxNewsBean getNewsBean() {
        return newsBean;
    }

    public void setXXX(FxNewsBean newsBean) {
        this.newsBean = newsBean;
    }

    // 由于这个方法与FxNewBeanAware中方法同名称所有不会被执行依赖注入
    @Override
    public void setFxNewsBean(FxNewsBean fxNewsBean) {
        this.newsBean = fxNewsBean ;
    }
}