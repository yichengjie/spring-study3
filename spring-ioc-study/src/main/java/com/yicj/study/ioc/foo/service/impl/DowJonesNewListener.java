package com.yicj.study.ioc.foo.service.impl;

import com.yicj.study.ioc.foo.model.FxNewsBean;
import com.yicj.study.ioc.foo.service.IFXNewsListener;

/**
 * ClassName: DowJonesNewListener
 * Description: TODO(描述)
 * Date: 2020/7/23 21:00
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class DowJonesNewListener implements IFXNewsListener {


    @Override
    public String[] getAvailableNewsIds() {
        return new String[0];
    }

    @Override
    public FxNewsBean getNewsByPK(String newId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}