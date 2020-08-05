package com.yicj.study.ioc.beanpostprocessor;

import com.yicj.study.foo.model.FxNewsBean;
import com.yicj.study.foo.service.IFXNewsListener;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: DowJonesNewsListener
 * Description: TODO(描述)
 * Date: 2020/7/25 15:43
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class DowJonesNewsListener implements IFXNewsListener, PasswordDecodable {

    @Setter
    @Getter
    private String password ;

    @Override
    public String[] getAvailableNewsIds() {
        // 省略
        return new String[0];
    }

    @Override
    public FxNewsBean getNewsByPK(String newId) {
        // 省略
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {
        // 省略
    }

    @Override
    public String getEncodedPassword() {
        return this.password;
    }

    @Override
    public void setDecodedPassword(String password) {
        this.password = password ;
    }
}