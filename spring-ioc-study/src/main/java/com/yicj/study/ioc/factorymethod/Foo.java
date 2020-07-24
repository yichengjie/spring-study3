package com.yicj.study.ioc.factorymethod;

/**
 * ClassName: Foo
 * Description: TODO(描述)
 * Date: 2020/7/24 9:57
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Foo {

    private BarInterface barInterface ;

    public BarInterface getBarInterface() {
        return barInterface;
    }

    public void setBarInterface(BarInterface barInterface) {
        this.barInterface = barInterface;
    }
}